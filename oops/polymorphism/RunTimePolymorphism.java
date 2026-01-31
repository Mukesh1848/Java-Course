// Method Overriding(Runtime Polymorphism)

// Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.The method in the subclass must have the same signature as in the superclass.

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Dog Barks

        Cat cat = new Cat();
        cat.makeSound(); // Cat Meows

        // Runtime polymorphism(Upcasting, Dynamic mothods dispatch)

        Animal bob = new Dog(); // Upcasting(Taking reference as a Animal class but object is of Dog class)
        bob.makeSound(); // Dog Barks

        Animal tom = new Cat(); // Upcasting(Taking reference as a Animal class but object is of Cat class)
        tom.makeSound(); // Cat Meows
    }
}
