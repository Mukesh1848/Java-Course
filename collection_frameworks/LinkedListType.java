package collection_frameworks;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListType {
    public static void main(String[] args) {
    // Without the LinkedList collection framework
    //    Node node1 = new Node();
    //    Node node2 = new Node();
    //    node1.value = 1;
    //    node2.value = 2;
    //    node1.next = node2;
    //    node2.next = null;
    //    System.out.println();

    LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(2);

        System.out.println(linkedList); // [1,5,3,4,2]
        // System.out.println(linkedList.get(2));  // take index and return value
        linkedList.addLast(4); // O(1)
        linkedList.addFirst(0); // O(1)
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println("size " + linkedList.size());
        System.out.println(linkedList); // [0,1,5,3,4,2,4]
        linkedList.removeIf(x -> x % 2 == 0);

          LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);

    }
}

class Node {

    public int value;

    public Node next;
}

// NOtes: Methods are same as ArrayList(// NOte: Array & LinkedList is not a thread safe )

// Commonly Used Methods:

// Adding Elements:
// add(E e): Appends the specified element to the end of the list.
// add(int index, E element): Inserts the specified element at the specified position in this list.
// addFirst(E e): Inserts the specified element at the beginning of this list.
// addLast(E e): Appends the specified element to the end of this list (equivalent to add(E e)).
// addAll(Collection<? extends E> c): Appends all of the elements in the specified collection to the end of this list.


// Removing Elements:
// remove(): Retrieves and removes the head (first element) of this list.
// remove(int index): Removes the element at the specified position in this list.
// remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.
// removeFirst(): Removes and returns the first element from this list.
// removeLast(): Removes and returns the last element from this list.
// clear(): Removes all of the elements from this list.


// Accessing Elements:
// get(int index): Returns the element at the specified position in this list.
// getFirst(): Returns the first element in this list.
// getLast(): Returns the last element in this list.


// Searching Elements:
// contains(Object o): Returns true if this list contains the specified element.
// indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 if the list does not contain the element.
// lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in this list, or -1 if the list does not contain the element.


// Other Useful Methods:
// size(): Returns the number of elements in this list.
// isEmpty(): Returns true if this list contains no elements.
// clone(): Returns a shallow copy of this LinkedList.
// set(int index, E element): Replaces the element at the specified position in this list with the specified element.