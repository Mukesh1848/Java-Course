package immutableClasses;

public class ImmutableClasessesPartTwo {
    public static void main(String[] args) {
        College college = new College("IIT Guwahati", "Assam");

        Student s1 = new Student(28, "Aditya", college);

        System.out.println(s1.getCollege().name); // IIT Guwahati

        s1.getCollege().name = "IIT BOMBAY";

        System.out.println(s1.getCollege().name); // IIT Guwahati
    }
}

// Immutable
// Defensive copy of college (non primitive)
final class Student {
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = new College(college.name, college.address);
    }

    // Getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        return new College(this.college.name, this.college.address);
    }
}

// Mutable
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
