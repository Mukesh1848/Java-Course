// Polymorphism using Overloading and Overriding
// Both overloading and overriding contribute to achieving polymorphism in Java:

// Method Overloading provides flexibility by allowing multiple methods with the same name but different parameters within the same class.
// Method Overriding allows dynamic method invocation, enabling different behaviors based on the object type at runtime.
// Example Demonstrating Both Overloading and Overriding

class Shape {
    // Overloaded method (Compile-time polymorphism)
    void draw() {
        System.out.println("Drawing a shape");
    }

    void draw(String shapeType) {
        System.out.println("Drawing a " + shapeType);
    }
}

class Circle extends Shape {
    // Overridden method (Runtime polymorphism)
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.draw(); // Calls draw() from Shape
        shape1.draw("Square"); // Calls overloaded draw() from Shape

        Shape shape2 = new Circle(); // Upcasting
        shape2.draw(); // Calls overridden draw() from Circle
    }
}

// It allows a single interface to represent different types of actions. Java
// supports two types of polymorphism:

// Compile-time polymorphism (Method Overloading)
// Runtime polymorphism (Method Overriding)