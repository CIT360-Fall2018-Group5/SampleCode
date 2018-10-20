/*
 * Here are just a few examples of working with ArrayLists
 */
package ArrayListDemo;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Wayne Thomas Code Sample Provided by
 * https://www.callicoder.com/java-arraylist/
 */
public class ArrayListDemo {
   
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

       //print list to screen
        System.out.println("Initial ArrayList : " + prophets);
        
        //add an element to a specific position in the ArrayList
        prophets.add(3, "Alma");
        
        System.out.println("Add a friend to a specific position : " + prophets);
        
        //Retrieve an element from the ArrayList
        
        String lastElement = prophets.get(prophets.size() - 1);
        //String firstElement = prophets.get(0);
        //String specificElement = prophets.get(4);
        
        System.out.println("Retrieve Element Example: " + lastElement);
        
        //Remove an element from the ArrayList 
        
        String removeSpecificElement = prophets.remove(3);
        
        System.out.println("Remove Element Example: " + removeSpecificElement);
        
        //Remove the element listed here if it exist in the ArrayList
        boolean isRemoved = prophets.remove("Alma");        
        /*If the element does not exist this will print out false. If it does exist, 
        the code above will remove the element and the following code will printout true*/
        System.out.println("Boolean Remove Example: " + isRemoved);
        System.out.println("Boolean Remove Example: " + prophets);
        
        //remove all elements from an ArrayList
        prophets.clear();
        System.out.println("Clear All Example: " + prophets);       
        
        
    }
}

