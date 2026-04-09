// Lambda expression is an anonymous function(no name, no return-type, no access modifier). It is introduced in java 8 version.

// Benefits of lambda fucntion -> 
// 1. Reduce the lines of code.
// 2.Sequential and parallel execution support by passing  behavior as an argument in methods
// 3. To call APIS veru effectively.
// 4. To write more readable, Maintainable and concise-code.

// example: () => {System.out.println("Hello world");}

// Note: Without functional interface we can't use Lambda expression.

// Important rules
// 1. If the body of lambda expression contain only one statement then curly braces are optional.
// ex:  () => System.out.println("hello")
// 2. java compiler also inter the type of varibale passed in arguments, hence type is optional
// ex:  (a,b) => System.out.println(a+b)

// Functional Interface : If the interface contains only one abstract method then it's a functional interface.
// ex : Runnable, Callable, Comparable ect.

// To Call lambda we require functional interface.

// Lambda is used to implement fucntional interface in very simple and short manner.

package lambda_expression;

public class Test {
    public static void main(String[] args) {

        System.out.println("hello workd");

    }
}
