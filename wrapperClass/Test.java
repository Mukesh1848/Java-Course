// Medium Article - https://medium.com/@gauravshah97/wrapper-classes-in-java-0c5d9205f3b3

package wrapperClass;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
  public static void main(String[] args) {
    int a = 5;
    Integer b = 10; // Wrapper class of int

    String str = "name is the mukesh"; // String data type is already a object type

    Integer c = 10; // int → Integer (autoboxing) // Behind the scenes, Java does something like:
    Integer d = Integer.valueOf(10);

    Integer.parseInt("123"); // 123 (String → int)
    Integer.valueOf("456"); // Integer object
    Integer.max(10, 20); // 20
    Integer.min(10, 20); // 10

    Integer.parseInt("123"); // 123 (String → int)
    Integer.valueOf("456"); // Integer object
    Integer.max(10, 20); // 20
    Integer.min(10, 20); // 10

    // Collections need objects
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10); // autoboxing happens here
    // ArrayList<int> list; // ❌ invalid

  }

}

// Java defines a wrapper class for each of its primitive data types. A Wrapper
// class in Java is one whose object wraps or contains primitive data types.

// Note: Java collection work only with the wrapper class(Object)

// Primitive Type -> Wrapper class
// boolean -> Boolean
// char -> Character
// byte -> Byte
// short -> Short
// int -> Integer
// long -> Long
// float -> Float
// double -> Double

// Autoboxing and Unboxing

// Autoboxing
// Autoboxing is the automatic conversion of a primitive data type to an object
// of the corresponding wrapper class.
// For example, boolean to Boolean, char to Character, byte to Byte, short to
// Short, int to Integer, long to Long, float to Float, and double to Double.

// Unboxing
// Unboxing is just the reverse process of autoboxing. It is the automatic
// conversion of a wrapper class object to the corresponding primitive data
// type.