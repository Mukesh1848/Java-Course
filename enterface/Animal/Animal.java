// In Java, an interface is a blueprint of a class that contains only abstract methods (methods without a body) and constants (variables declared as public, static, and final by default). Interfaces help achieve abstraction and multiple inheritance, making Java programs more modular and maintainable.

// Why Use Interfaces?

// 1. Achieve Abstraction: Interfaces allow us to define methods without implementing them, leaving the implementation to child classes.
// 2. Support Multiple Inheritance: Unlike classes, Java allows a class to implement multiple interfaces, overcoming the limitations of single inheritance.
// 3. Ensure Loose Coupling: Interfaces separate the definition of functionality from implementation, making code more flexible and scalable.

package enterface.Animal;

public interface Animal {

    // these two variable declareation is same because in interface all the
    // variables are public, static and final by default
    public static final int MAX_AGE = 100;
    // int max_age = 100;

    // abstract methods always need to define into the implements class but static
    // methods no need to define into the implements class
    public abstract void eat();

    public abstract void sleep();

    // static methods allowed in interface since java 8 and these methods allow only
    // with the interface name not with the object/implements classes
    public static void info() {
        System.out.println("This is an animal interface");
    }

    // default methods can be access with the object/implements classes(but not to
    // override means every implements class need to define this method)
    // and these methods can't be access by interface name
    public default void walk() {
        this.eat(); // this point to the callable instance method
        System.out.println("Animal is walking");
    }
}
