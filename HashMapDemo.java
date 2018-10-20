/*
/*
 *  Here are just a few examples of working with Hashmap
 */
package HashMapDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wayne Thomas Code Sample Provided by
 * https://www.callicoder.com/java-hashmap/
 */
public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, Double> menuItems = new HashMap<>();

        // check to see if the HashMap is empty
        System.out.println("\n Is there nothing on the menu? " + menuItems.isEmpty());
        //populate the HashMap
        menuItems.put("16oz Steak", 21.99);
        menuItems.put("Lobster", 17.99);
        menuItems.put("Crab Legs", 15.99);
        menuItems.put("Shrimp Scampi", 12.99);
        menuItems.put("Hamburger", 10.99);
        menuItems.put("Grilled Chicken", 9.99);

        System.out.println("\n How about now?" + menuItems);

        //Presents how many elements that are in the HashMap        
        System.out.println("\n How many items are there? " + menuItems.size());

        //Looks to see if the value is present. If so then prints the item and price
        //to the screen. If not, it will print the price is not available.
        String entree = "Crab Legs"; 
        //String entree = "Buffalo Wings"; //enable this to test the else statement.

        if (menuItems.containsKey(entree)) {
            Double menuItem = menuItems.get(entree);
            System.out.println("\n The cost of the " + entree + " is $" + menuItem + " ! ");
        } else {
            System.out.println("We do not have any " + entree + " available at this time.");
        }

    }

}
