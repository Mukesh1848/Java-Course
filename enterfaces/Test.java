// In java, enterfaces is used to achieve abstraction and multiple inheritance.
// An interface is a reference type in Java, similar to class, that can contain only constants

// class -> blueprint of an object
// interface -> blueprint of a class(a class that can hold an abstract methods & static constant & static methods & default methods)
// interface -> to achieve a multiple inheritance and abstraction(pure abstraction) 
// An interface can not be instantiated, it can only be implemented by a class.
// A class can implement multiple interfaces, but it can only extend one class.



package enterfaces;

public class Test {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.makeSound(); // Output: Woof Woof
        dog.eat(); // Output: Dog is eating

        Cat cat = new Cat();
        cat.makeSound(); // Output: Meow Meow   
        cat.eat(); // Output: Cat is eating

        // dog.MaxAge = 25; // This will not compile, as MaxAge is a static constant in the interface

        System.out.println("Max Age of Animal: " + Animal.MaxAge); // Output: 20
        System.out.println("Max Age of Dog: " + Dog.MaxAge); // Output: 20
        System.out.println("Max Age of Cat: " + Cat.MaxAge); // Output: 20

        Animal.info(); // Output: info of Animal interface

        dog.run(); // Output: Animal is running
        cat.run(); // Output: Animal is running

        // Animal.run();  // This will not compile, as run() is a default method and cannot be called on the interface directly
       
    }
}
