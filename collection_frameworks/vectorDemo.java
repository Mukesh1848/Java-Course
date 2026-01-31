package collection_frameworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        // Vector<Integer> vector =  new Vector<>(); // by default capacity is 10
        // Vector<Integer> vector =  new Vector<>(15); // set initial capacity 15
        Vector<Integer> vector =  new Vector<>(5, 5); // set initial capacity 15 and increment by 5
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println();
        System.out.println("vector capacity " + vector.capacity());
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println("vector size " + vector.size());
        System.out.println("vector capacity " + vector.capacity());

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(52);
        arrayList.add(53);
        Vector<Integer> vector2 = new Vector<>(arrayList);
        Vector<Integer> vector3 = new Vector<>(Arrays.asList(45,56,78));
        System.out.println("vector2 "+ vector2);
        System.out.println("vector3 "+ vector3);
    }
}


// note 
// 1. By default vector capacity is increased by 2x(double)
// 2. We can increment vector capacity with specific number of time
// 3. we can pass collection of a list into vector(ArrayList, linkedList, list)


// Methods of Vector
// add(element)
// add(index,element)
// get()
// size()
// containes()
// isEmpty()
//  set(index, element) // replace the element
// remove()  // remove element
// remove(object) // first occurence
// clear()