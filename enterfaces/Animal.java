 // note: In an interface, all methods are implicitly public and abstract, and all fields are implicitly public, static, and final.
// So, you can omit the public and abstract keywords for methods, and public, static, and final for fields.
// However, it's a good practice to include them for clarity.

// An interface cannot have a constructor, as it cannot be instantiated.
// An interface can extend another interface, but it cannot implement another interface.    
// An interface want to definea body of methds, it can use default methods (Java 8 and later) or static methods.



package enterfaces;

public interface Animal {
    
    public static int MaxAge = 20; // Static constant in an interface

    public abstract void makeSound(); // Abstract method with no body

    public abstract void eat(); // Abstract method with no body


    // without static keyword, we can't make body of the method in an interface
    // static methods can be called using only interface name, not the object of the class that implements the interface
    public static void info() { // Static method with a body
        System.out.println("info of Animal interface");
    }

    // default method with a body
    // Default methods can be called using the object of the class that implements the interface
    // if we want to use some methds only on some specific class so we will make a default method now class can access using the object of the class that implements the interface, no need to use all interface class to access this method,
   public default void run() {
        this.eat();
        System.out.println("Animal is running ");
    }

   
}
