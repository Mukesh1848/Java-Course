package oops.inheritance;

public class Child extends Father {
    Child(String name, int age) {
        super(name, age); // calls the constructor of the immediate parent class
        System.out.println("Child Constructor called");
    }

    @Override // Always write as @Override if any methods is overridden
    public void workDetails() {
        System.out.println("Currently studying");
    }
}
