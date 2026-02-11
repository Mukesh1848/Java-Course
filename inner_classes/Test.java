// Inner class is a class defined within another class. It can access the members of the outer class, including private members.

// types of inner classes:
// 1. Member inner class(non-static inner class)
// 2. Static nested class
// 3. Local inner class
// 4. Anonymous inner class

// Member Inner Class: When you need a class that is tightly coupled with the outer class and requires access to its members.
// Static Nested Class:	When the inner class can work independently of the outer class and does not require instance variables.
// Local Inner Class: When you need a short-lived class inside a method, especially for data encapsulation within that method.
// Anonymous Inner Class: When you need to override methods quickly, commonly used in event handling (e.g., button click listeners).

package inner_classes;

public class Test {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota");

        // Accessing the inner class to start the engine
        Car.engine engine = myCar.new engine();
        System.out.println();

        // Starting the engine
        engine.start();

        // Stopping the engine
        engine.stop();

        // Creating a Computer object
        Computer myComputer = new Computer("Dell XPS", "11th Gen", "Windows 10");
        // Accessing the static inner class OperatingSystem
        Computer.OperatingSystem os = new Computer.OperatingSystem("Windows 10");
    }
}
