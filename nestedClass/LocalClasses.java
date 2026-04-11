// We can make class inside any code block(if, else, loop, constructor, switch, function, static block) that's a local class.


package nestedClass;

public class LocalClasses {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.sayHello();
    }
}


class Outer {
    void sayHello() {
        class Inner {
             void sayHello() {
                System.out.println("hello");
             }
        }
        Inner localInner = new Inner();
        localInner.sayHello();
    }
}
