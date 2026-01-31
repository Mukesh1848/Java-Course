
class SingletonPattern {
    // Only Accessed by class-name and can't extend by childClass
    private static final SingletonPattern instance = new SingletonPattern();

    // Constructor will insure do not create multiple object of the class.
    private SingletonPattern() {
    }

    // This method insures that only one instance of the class is created and every
    // it will return the same instance of the class
    public static SingletonPattern getInstance() {
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        // SingletonPattern newInstance = new SingletonPattern(); // This will throw an
        // error

        SingletonPattern obj1 = SingletonPattern.getInstance();
        SingletonPattern obj2 = SingletonPattern.getInstance();
        System.out.println(obj1 == obj2); // Output: true (Same instance)
    }
}

// A Singleton Class in Java is a design pattern that restricts the
// instantiation(can't make multiple objects only can create one object of the
// class) of a class to a single instance. It ensures that only one
// object of the class exists in the entire application and provides a global
// point of access to that instance.

// Why Use Singleton Pattern?

// To manage shared resources like database connections or configuration
// settings.
// To ensure controlled object creation and save memory.
// To provide global access to a single instance.