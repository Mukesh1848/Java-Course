//types of Error in Java
// 1. Syntax Error
// 2. Runtime Error
// 3. Logical Error  


// Runtime Error(Exception Handling) in Java
// Programe will run in some cases. so we will handle those exception

// The Exception handling is a way to handle the runtime errors so that the normal flow of the application can be maintained. It is and object that is thrown at runtime.

package Exceptions_Handling;

public class Main {
    
    public static void main(String[] args) {
        int[] numerators = {10, 20, 30, 40, 50};
        int[] denominators = {2, 0, 5, 0, 10};

        System.out.println();
        for(int i=0; i<numerators.length; i++) {
            System.out.println(devide(numerators[i], denominators[i]));
        }

        System.out.println("End of program");
        }

        public static int devide(int numerator, int denominator) {
            // return numerator / denominator;
            try {
                return numerator / denominator;
                
            // } catch (ArithmeticException e) {
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
                return 0; // return 0 if there is an exception
            }
        }

        // After running above of the code is giving runtime error
        // Error is -> Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at Exceptions_Handling.Main.devide(Main.java:22)
        // at Exceptions_Handling.Main.main(Main.java:15)
}


// types of exception
// In Java, exceptions are categorized into two main types: checked exceptions and unchecked exceptions.
// 1.ArithmeticException
// 2.ArrayIndexOutOfBoundsException
// 3.NullPointerException
// 4.ClassCastException 
// 5.NumberFormatException
// 6.FileNotFoundException
// 7.IOException
// 8.ClassNotFoundException
// 9.StringIndexOutOfBoundsException
// 10.InputMismatchException


// Note: No need to check for ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, etc.
// because they are unchecked exceptions. Unchecked exceptions are not checked at compile time, so you  
// don't need to handle them explicitly. However, you can still catch them if you want to handle them gracefully.

// simplly use (Exception) this will handle all error because it's a parent of all errors 

// Note: If you want to handle specific exceptions, you can catch them individually before the general Exception catch block.
// For example, you can catch ArithmeticException first and then catch Exception to handle other exceptions.