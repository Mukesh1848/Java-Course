// Immutable Class -> An immutable class in Java is one whose instances cannot be modified after they are created. All internal state is set during object construction and remains constant for the lifetime of that object. 

// Rules to make class immutable

// 1. Make class as final
// 2. Mark all field(instnace variable) private and final
// 3. Don't allow any setters


// Medium link - https://medium.com/@brijesh.sriv.misc/mastering-immutable-classes-in-java-85a75da2aaa8

package immutableClasses;

public class ImmutableClassesPartOne {
    public static void main(String[] args) {
        // When have two varibale of instnace
        // Student s1 = new Student(23, "mukesh");
        // System.out.println(s1.getAge());
        // System.out.println(s1.getName());

        // Now add the College with multiple variabels
        College college = new College("IIT Bombey", "Mumbai");
        Student s2 = new Student(23, "mukesh",college);
        System.out.println(s2.getCollege().name); //  IIT Bombey

        // Update student college name(from College class)
        s2.getCollege().name = "IIT Delhi";
        System.out.println(s2.getCollege().name); //  IIT Delhi

        //Note->  So my Student class in not purely immutable becaunse i can chnage student college information
    }
}


// Immutable class(Not Immutable Purely)
final class Student {
    private final int age;
    private final String name;
    private final College college;

    // Constructor
    Student(int age, String name,College college){
        this.age = age;
        this.name = name;
        this.college= college;
    }


    // Getters
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public College getCollege(){
        return this.college; // This is giving the direct reference of college
    }
}


// Mutable
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name= name;
        this.address = address;
    }
}