// Interface can't be instantiated and can't have constructor

package enterface.Animal;

public class Test {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // can't instantiate interface

        System.out.println(Animal.MAX_AGE);
        Animal.info();

        // can't access default method with interface name
        // System.out.println(Animal.walk());

        // InterFaces constant variable always access with interface name not to
        // implements
        System.out.println(Dog.MAX_AGE);
        System.out.println(Cat.MAX_AGE);

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.walk(); // only access with object/implements classes

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.walk(); // only access with object/implements classes
    }
}
