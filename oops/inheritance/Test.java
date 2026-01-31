package oops.inheritance;

public class Test {
    public static void main(String[] args) {
        Child child = new Child("John down", 10);
        System.out.println(child.getName());
        System.out.println(child.getAge());
        child.workDetails();

        Father father = new Father("Deol down", 35);
        System.out.println(father.getName());
        System.out.println(father.getAge());
        father.workDetails();

        GrandFather grandFather = new GrandFather("tills down", 65);
        System.out.println(grandFather.getName());
        System.out.println(grandFather.getAge());
        grandFather.workDetails();
    }
}

// Inheritance is one of the fundamental concepts of Object-Oriented Programming
// (OOP) that allows a class to inherit the properties and behaviors (fields and
// methods) of another class. It promotes code reusability, modularity, and
// hierarchy in programming.

// Why Use Inheritance?
// Code Reusability: Reduces code duplication by allowing child classes to reuse
// existing code.
// Modularity: Enhances maintainability by keeping related functionalities
// within a structured hierarchy.
// Extensibility: Enables extending functionalities without modifying existing
// code.
// Improved Readability: Provides a clear relationship between classes, making
// the program easier to understand.