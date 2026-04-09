// Q1. What is Wrapper class?

// Ans. Java defines a wrapper class for each of its primitive data types. A Wrapper class in Java is one whose object wraps or contains primitive data types. Wrapper classes help you write cleaner code, which is easy to read.

// Need & Advantages of Wrapper Class

//1. Java collection framework works with objects only. All classes of the collection framework (ArrayList, LinkedList, HashSet, etc.) deal with objects only.

//2.  Serialization can be achieved via Wrapper classes. Serialization is converting the objects into streams. If we have a primitive value, we can convert it into objects through the wrapper classes.

//3.  If we pass a primitive value as a method parameter, it will not change the original value. But, if we convert the primitive value into an object, we can change its original value.

//4.  The java.util package provides the utility classes to deal with objects.

//5.  Synchronization can be achieved via Wrapper classes as synchronization works with objects in Multithreading.

// Primitive Type	  Wrapper class
// boolean	          Boolean
// char	              Character
// byte	              Byte
// short	          Short
// int	              Integer
// long	              Long
// float	          Float
// double	          Double


//1. All the numeric wrapper classes (Byte, Short, Integer, Long, Float, Double) extend the class java.lang.Number.

//2.  Classes Boolean and Character directly extend the class Object.

//3.  All the wrapper classes implement the interfaces java.io.Serializable and java.lang.Comparable.


// Autoboxing and Unboxing

// Autoboxing

// Autoboxing is the automatic conversion of a primitive data type to an object of the corresponding wrapper class.
// For example, boolean to Boolean, char to Character, byte to Byte, short to Short, int to Integer, long to Long, float to Float, and double to Double.


// Unboxing

// Unboxing is just the reverse process of autoboxing. It is the automatic conversion of a wrapper class object to the corresponding primitive data type.



public class AutoBoxingAndUnBoxing {
        public static void main(String []args){

        // Autoboxing
        int x = 5;
        Integer y = x; // Modern java
        // Integer z = new Integer(x); // Old java(The constructor Integer(int) has been deprecated since version 9 and marked for removal)
        Integer num = Integer.valueOf(x); // Internally works modern java
        Boolean bool = true;
        Character ch = 'c';
        Byte b = 2;
        Short s = 2;
        Integer i = 1;
        Long l = 4L;
        Float f = 1.2f;
        Double d = 1.2;

        // Unboxing
        Integer number = 50;
        int num1 = number; // Unboxing
        // int num1 = number.intValue(); // Compiler internally
    }
}

// AutoBoxing and Unboxing supports

// 1. Assignments(assignments)
// 2. Method parameter(can take Interger or int vice-versa)
// 3. Arithmatic operation


// Internally Integer class

class IntegerClass {
    int value;
    // constructor
    static Integer valueOf(int x){
        // something
        return Integer.valueOf(x);
    }

    int intValue(){
        return value;
    } 
}


