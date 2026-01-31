package collection_frameworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class NumberComparison implements Comparator<Integer>{
    
     @Override
     public int compare(Integer a, Integer b) {
    
         // if return value is negative so return first value else second value(for ascending order and reverse of descending value)
        // return a - b; // asecending order
        return b - a; // asecending order
     }
}

class StringLengthComparator implements Comparator<String> {

    public int compare(String a, String b){
        return a.length() - b.length();
    }
}

public class Main {
    public static void main(String[] args) {
         // int[] ages = new int[10]; // fixed length of array
         // for(int i=0;i<ages.length;i++){
         //    ages[i] = i+1;
         // }
         // for(int i=0;i<ages.length;i++){
         //    System.out.println("ages " + ages[i]);
         // }

         ArrayList<Integer> newArray = new ArrayList<>(); // resizable list(dynamic size list)

         newArray.add(4);
         newArray.add(8);
         newArray.add(6);
         newArray.add(2);
         newArray.add(10);

         newArray.sort(null); // ascending order
         newArray.sort(new NumberComparison()); // ascending order

         //  for(int i=0; i<newArray.size(); i++){
         //    System.out.println("number" + newArray[i]);
         // }

        //  for(int x : newArray){
        //     System.out.println(x);
        //  }

         List<String> newStringArray = new ArrayList<>(); // resizable list(dynamic size list)
         newStringArray.add("mukesh");
         newStringArray.add("ram");
         newStringArray.add("suraj");
         newStringArray.add("bhajat nation");
         newStringArray.add("laxkman");

        //  newStringArray.sort(null);  //sort in ascending order with character
        newStringArray.sort((a, b) -> a.length() - b.length()); // sort in ascedning order with the length of the string
        newStringArray.sort(new StringLengthComparator()); // sort with the length of string in asecendng order
        

          for(String x : newStringArray){
            System.out.println(x);
         }


         // List<String> arrayList = Arrays.asList("sunday", "tuesday"); // fixed size list(but we can replace the element but not adds the element)

         // List<Integer> list = List.of(1,2,3,4); // fixed size not also not modifiable
    }
}

// Methods 

// add(element)
// add(index, element)
// addAll() add whole list into the ArrayList
// get(index)
// set(index, element)
// remove(index)
// Collections.sort(listName) sort the list
// list.sort(null) sort the list (null -> Ascending order)
// list.sort(comparetor)
// remove(Integer.valueOf(value/element))
// isEmpty()
// size()
// clear()
//  clone()
// contains(element)
// trimToSize()
// Arrays.asList(fixed size only can set the element)
// List.of(fixed size also not able to add & set element)
// initail capacity = 10
// growth factor = 1.5 times size increase at a time


// time complexity

// add() - o(n)
// remove() - o(n)
// get() - o(1)
// iterate - o(n)


// NOte: Array & LinkedList is not a thread safe 