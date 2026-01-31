package oops.inheritance;

public class Father extends GrandFather {

    Father(String name, int age) {
        super(name, age); // calls the constructor of the immediate parent class
        System.out.println("Father Constructor called");
    }

    @Override
    public void workDetails() {
        System.out.println("Working as a senior Software engineer");
    }
}
