/*
*  Here are just a few examples of working with Treemap
 */
package TreeMapDemo;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Wayne Thomas Code Sample Provided by
 * https://www.callicoder.com/java-treemap/
 */
public class TreeMapDemo {

    public static void main(String[] args) {

        //Create a TreeMap
        //SortedMap<String, Double> lunchOptions = new TreeMap<>();
        
        //Create a TreeMap using a Comparator
        SortedMap<String, Double> lunchOptions = new TreeMap<>(new Comparator<String>() {
            
            //Presents list in descending order.
            @Override
              public int compare (String s1, String s2){
            
                return s2.compareTo(s1);
            }
        });
        
        //The above statement can be simplified to read.
        //SortedMap<String, Double> lunchOptions = new TreeMap<>(new Comparator.reverseOrder());
             
        //Populate the TreeMap
        lunchOptions.put("Club Sandwich",5.99);
        lunchOptions.put("Rueben Sandwich",6.99);
        lunchOptions.put("Gyro Sandwich",6.99);
        lunchOptions.put("Hamburger",7.99);
        lunchOptions.put("Cheeseburger",8.99);
        lunchOptions.put("Chicken Sandwich",7.99);

        // print it out
        System.out.println(lunchOptions);

    }

}
