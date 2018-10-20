/*
 * Here are just a few examples of working with LinkedLists
 */
package LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Wayne Thomas Code Sample Provided by
 * https://www.callicoder.com/java-linkedlist/
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        //establish a new LinkedList
        LinkedList<String> friends = new LinkedList<>();

        // populate the list
        friends.add("Isabel");
        friends.add("Zane");
        friends.add("Joe");
        friends.add("Wayne");
        //print list to screen
        System.out.println("Initial LinkedList : " + friends);
        //add an element to a specific position
        friends.add(0, "Brother Tuckett");

        System.out.println("Add a friend to specific position : " + friends);
        //add an element to the first position
        friends.addFirst("President Nelson");

        System.out.println("Add a friend to the first position : " + friends);
        //add a friend to the last position
        friends.addLast("Holy Ghost");

        System.out.println("Add a friend to the last position : " + friends);

        //Adding elements from one collection to this LinkedList
        List<String> otherFriends = new ArrayList<>();
        //populate the ArrayList
        otherFriends.add("Moroni");
        otherFriends.add("Lehi");
        otherFriends.add("Nephi");
        otherFriends.add("Mormon");
        otherFriends.add("Joseph Smith");

        //Combine the ArrayList to the LinkedList
        friends.addAll(otherFriends);

        System.out.println("Combined list: " + friends);
        
        
        //Retrieve an element from the LinkedList
        
        //String lastElement = friends.getLast();
        //String firstElement = friends.getFirst();
        String specificElement = friends.get(1);
        
        System.out.println("Retrieve Element Example: " + specificElement);
        
        //Remove an element from the LinkedList
        
        //String removeLastElement = friends.removeLast();
        //String removeFirstElement = friends.removeFirst();
        //friends.clear(); //removes all elements
        String removeSpecificElement = friends.remove(5);
        
        System.out.println("Remove Element Example: " + removeSpecificElement);
    }
}

