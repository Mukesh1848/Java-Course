// Note -> Inner class can access any member of outer class(static or non-static)

// Note -> Inner class can't make static methods and variables(Before 16)

package nestedClass;

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer(); //Outer Class Object
        Outer.Inner inner = outer.new Inner();// Inner class Object
        Outer.Inner inner1 = new Outer().new Inner();// Inner class Object diretcly from outer class
        inner.fun();
    }
}


class Outer {
 int x = 10;
    class Inner {
        int x = 20;
       void fun(){
        System.out.println("Let's do fun somethings");
        System.out.println(x);  //inner class x
        System.out.println(Outer.this.x); // Outer class x 

       }
    }
}