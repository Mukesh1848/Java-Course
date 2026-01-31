// Notes -> 

// ✔ Cannot be instantiated – You cannot create an object of an abstract class. 
// ✔ Can have abstract methods – Methods without implementation that subclasses must define. 
// ✔ Can have concrete methods – Fully implemented methods that all subclasses inherit. 
// ✔ Can have constructors – Used to initialize fields, just like a normal class. 
// ✔ Can contain variables – Both instance and static variables are allowed.

// Abstract class
abstract class Vehicle {
    int speed;
    String fuelType;

    // Constructor
    Vehicle(int speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Abstract method (to be implemented by subclasses)
    abstract void move();

    // Concrete method (common functionality for all vehicles)
    void showInfo() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    Car(int speed, String fuelType) {
        super(speed, fuelType);
    }

    @Override
    void move() {
        System.out.println("Car moves on roads.");
    }
}

// Subclass Airplane
class Airplane extends Vehicle {
    Airplane(int speed, String fuelType) {
        super(speed, fuelType);
    }

    @Override
    void move() {
        System.out.println("Airplane flies in the sky.");
    }
}

// Main class to test
public class AbstractExample {
    public static void main(String[] args) {
        Vehicle car = new Car(120, "Petrol");
        car.showInfo();
        car.move();

        System.out.println();

        Vehicle airplane = new Airplane(800, "Jet Fuel");
        airplane.showInfo();
        airplane.move();
    }
}
