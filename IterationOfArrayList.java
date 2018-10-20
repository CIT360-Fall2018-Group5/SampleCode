/*
 * Example code showing forEach loop, for loop, and while loop
 */
package ArrayListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
  * @author Wayne Thomas Code Sample Provided by
 * https://www.callicoder.com/java-arraylist/
 */
public class IterationOfArrayList {
    public static void main(String[] args) {
        //establish a new ArrayList
        //Adding elements from one collection to this ArrayList
        List<String> prophets = new ArrayList<>();
        //populate the ArrayList
        prophets.add("Moroni");
        prophets.add("Lehi");
        prophets.add("Nephi");
        prophets.add("Mormon");
        prophets.add("Joseph Smith");

       //print list to screen via forEach loop
        System.out.println("\n Iteration of an ArrayList Using forEach ");
        prophets.forEach(prophet -> {                
                System.out.println(prophet);        
        });
        //print list to screen via for loop
        System.out.println("\n Iteration of an ArrayList Using for loop ");
        
        for(int i = 0; i < prophets.size(); i++){
        System.out.println(prophets.get(i));
        }
        System.out.println("\n Transverse the list using a while loop, a listIterator with hasPrevious() ");
        // while loop used to transverse the list
        ListIterator<String> prophetsListIterator = prophets.listIterator(prophets.size());
        while (prophetsListIterator.hasPrevious()) {
            String prophet = prophetsListIterator.previous();
            System.out.println(prophet);
        } 
    }
}
