package enterfaces.abstract_class;

public abstract class Car {
      
    public abstract void start(); // Abstract method with no body

    public abstract void stop(); // Abstract method with no body

    public void show() { // Concrete(regular) method with a body
        System.out.println("This is a concrete method in an abstract class.");
    }
}


// abstract class -> a class that can have abstract methods and concrete methods
// An abstract class cannot be instantiated, it can only be extended by another class.
