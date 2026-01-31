// the static keyword in java basicaaly is used for memory management primarlly.
// it can be applied in varibale, methods, block and nested class.
// the main concept of behind of static is that it belongs to the class rather than instances(Object) of the class.

package static_keyword;

public class JavaStatic {
    public static void main(String[] args){
        System.out.println("use of java Static keyword");
        System.out.println("student count " + Student.count); // Accessing static variable directly using class name, it will return 0 because no instance is created yet.(but still count is initialized to 0 by default )
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        System.out.println("Total number of students created: " + Student.count); // static variable access and count is 4.
        student1.setAge(24);
        System.out.println("count " + student1.count); // Accessing static variable through an instance(it will return current value of count means (4 because 4 instances are created))
        System.out.println(student1.getAge());

        JavaStatic javaStatic = new JavaStatic();
        int result = javaStatic.sum(5, 10); // Calling static method using an object instance
        System.out.println("Sum of 5 and 10 is: " + result); // Output: Sum of 5 and 10 is: 15

        int multiplyResult = multiply(10, 5); // Calling static method using class name
        // int multiplyResult = javaStatic.multiply(10, 5); // This will also work, but it's not recommended to call static methods using an instance.
        System.out.println("multiply " + multiplyResult); 


        // access the utils functions
        int square = Utils.square(5); // Calling static method from Utils class
        System.out.println("Square of 5 is: " + square); // Output: Square of 5 is: 25
        boolean isEven = Utils.isEven(10); // Calling static method from Utils class
        System.out.println("Is 10 even? " + isEven); 

        School.getInstance(); // Accessing the singleton instance of School class and this will return the same instance every time.

        // School school = new School(); // This will give an error because the constructor is private
    
    }

    int sum(int a, int b){
        return a + b;
    }

    static int multiply(int a, int b){
        return a * b;
    }
}


// note:
// 1.  the static methods can not use not-static variables or methods(non-static) directly.
// 2.  the static methods can be called without creating an instance of the class.
//3. the static methods can be called using class name or object instance.
// 4.  the static methods can access static variables directly.
// 5. the static methods can not access non-static variables or methods directly.
// 6.  the static methods can be overridden but not overloaded.
// 7.  the static methods can be used to create utility methods that can be called without creating an instance of the class.
// 8. this and super can not be used in static context.

// this(current -> object) and super(parent)