// final keyword in Java
// The final keyword in Java is used to declare constants, methods that cannot be overridden, and classes that cannot be subclassed(extends).
// It can be applied to variables, methods, and classes.
// When a variable is declared as final, its value cannot be changed once it has been initialized.
// When a method is declared as final, it cannot be overridden by subclasses.
// When a class is declared as final, it cannot be subclassed.
// The final keyword is often used to create immutable objects, which are objects whose state cannot be changed after they are created.
// Example of final variable, method, and class in Java 

package final_keyword;

public final class Test {
    public static void main (System[] args) {
        
        final int age = 5; // final variable, cannot be changed
        // age = 10; // This line would cause a compilation error
        

        // we can'nt make setter for final variable

        // public setAge(int newage){
        //     age = newage; 
        // }
        
    }

    public final int sum(int a, int b) { // final method, cannot be overridden
            return a + b;
        }
}