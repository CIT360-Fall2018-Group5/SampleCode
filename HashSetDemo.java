/*
 *  Here are just a few examples of working with HashSet
 */
package HashSetDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Wayne Thomas Code Sample Provided by
 * https://www.callicoder.com/java-hashset/
 * Sorting examples Provided by 
 * https://beginnersbook.com/2015/09/sorting-hashset-java/
 */
public class HashSetDemo {
    public static void main(String[] args){
    
        Set<String> monthsOfTheYear = new HashSet<>();
        
        // add elements to the HashSet
        
        monthsOfTheYear.add("January");
        monthsOfTheYear.add("February");
        monthsOfTheYear.add("March");
        monthsOfTheYear.add("April");
        monthsOfTheYear.add("May");
        monthsOfTheYear.add("June");
        monthsOfTheYear.add("July");
        monthsOfTheYear.add("August");
        monthsOfTheYear.add("September");
        monthsOfTheYear.add("October");
        monthsOfTheYear.add("November");
        monthsOfTheYear.add("December");
    
        //Note that if you try to add a duplicate entry, HastSet will ignore it
        
        System.out.println("\n HashSet nonsorted " + monthsOfTheYear); 
        //remember that elements are not in any guaranteed order.
        
        //To get the HashSet elements to sort, you can use two methods 
        //1. A List interface and 
        //2. Using a TreeSet
        
        List<String> monthsList = new ArrayList<String>(monthsOfTheYear);
        Collections.sort(monthsList);
        System.out.println("\n HashSet alphabetically sorted using an ArrayList " + monthsList);
        
        TreeSet<String> monthsTSet = new TreeSet<String>(monthsOfTheYear);
        System.out.println("\n HashSet elements after using TreeSet: "+ monthsTSet);
        
        System.out.println("\n A HashSet using iterator()");
        Iterator<String> monthsOfTheYearIterator = monthsOfTheYear.iterator();
        while (monthsOfTheYearIterator.hasNext()) {
            String monthsOfTheYearIter = monthsOfTheYearIterator.next();
            System.out.println(monthsOfTheYearIter);
        }
    }
}
