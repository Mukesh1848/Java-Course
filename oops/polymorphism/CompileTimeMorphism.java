// Method Overloading(Compile-Time Polymorphism)

// Method overloading in Java allows multiple methods to have the same name but different parameters.The compiler determines which method to call based on the method signature(number and type of parameters).
class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimeMorphism {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println("Sum of two integers: " + obj.add(5, 10));
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of two double values: " + obj.add(5.5, 2.2));
    }
}
