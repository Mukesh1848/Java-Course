// Note -> A class without name is called Anonymous class. Anonymous class not have constructor due to without name of class.

package nestedClass;

public class AnonymusClasses {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.greet();
        // Direct classes
        Guest guest = new Guest();
        guest.greet();

        // Anonymous class without making new class and name
        Person person2 = new Person() {
            @Override 
            void greet() {
                introduce();
                System.out.println("Hello, i'm a guest");
            }

            void introduce(){
                 System.out.println("Hello, i'm a guest rajneesh");
            }
        };
        person2.greet();
        // person2.introduce(); // Can't call the introduce becuase it's reference(object) of the Person class and person class does not hold introduce fucntion/method. Can only call inside the @override methods
    }
}

class Person {
    void greet() {
        System.out.println("Hello, i'm a person");
    }
}

class Guest extends Person {
   @Override 
   void greet() {
       System.out.println("Hello, i'm a guest");
   }
}