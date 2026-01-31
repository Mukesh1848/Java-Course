package enterfaces;

public class Cat implements Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

}
