// Static keyword -> It's means it's a property of class instead of object. We have access directly using class. It's a part of class instead of object

// Note -> We can make inner class object without making the object of outer class.

// Note -> Static class can't access the not static varibales.

// Note -> static fucntion also can't access the not static variables.

// Note -> Not Static varibale or methods is a property of object instead of class.

// Note -> We can access not static varibale based on class reference or pass class referce into the object(constructor)

// Note -> Inner can access the private variable of Outer class.

// Note -> Inner can class extends the other class and also implements the interfaces. Inner class can make static and not-static varibale and methods. Also can use Access modifier


/*  Use Cases of static nested class

1. As helper class on any outer class(BankAccount class)
2. Builder design pattern
3. If you want to have static methods inside a nested class
4. Requesr/Response DTO

*/

package nestedClass;

public class StaticInnerClass {
    public static void main(String []args){
       Outer outer = new Outer(); // Outer class object
       System.out.println(outer.value);
    //    Outer.Inner inner = new Outer.Inner(); // Inner class object
       Outer.Inner inner1 = new Outer.Inner(outer); // Inner class object
    //    inner.printMessage();
    //    inner.fun(outer); 

    }
}

class Outer {

    static String value = "hello";
    int y = 10;

    static void printNumber(){
        // System.out.println(y);  // can't access
    } 

    static class Inner {
        Outer outer;
        Inner (Outer outer){
            this.outer = outer;
        }
       void printMessage(){
           System.out.println(value);
        // System.out.println(y); // can't access
       }

    // But want to access not-static varibales(access based on class reference)
      void fun(Outer outer){
        System.out.println(outer.y);
      }
    }
}


class BankAccount {

    private static class InterestCalculator {
        // Inner class Method
        static double calculateYearly(double principle, double interest){
            return principle * interest;
        }
    }

    // Outer class method
    public double computeInterest(double principle){
        return InterestCalculator.calculateYearly(principle, 0.9);
    }
}