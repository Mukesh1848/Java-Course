package collection_frameworks;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
         stack.push(1);
         stack.push(2);
         stack.push(3);
         stack.push(4);
         stack.push(5);
         System.out.println();
         System.out.println("stack "+ stack);
         System.out.println("stack size "+ stack.size());
         
         int removedElement = stack.pop();
         System.out.println("stack size "+ stack.size());
         System.out.println("stack peek "+ stack.peek()); // top element
         System.out.println("empty "+  stack.isEmpty());
    }
}


//  Since Stack extends Vector, it is synchronized, making it thread safe.
//  Methods

// add(element)
// add(index,element)
// isEmpty()
// remove()  // remove element
// remove(object) // first occurence
// search(element) // give index from top and 1-based indexing