/*
 *  Here are just a few examples of working with TreeSet
 */
package TreeSetDemo;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Wayne Thomas Code Sample Provided by
 * https://www.callicoder.com/java-treeset/
 */
public class TreeSetDemo {

    public static void main(String[] args) {

        //Create a TreeSet
        SortedSet<String> shoes = new TreeSet<>();

        //Add elements to the TreeSet
        shoes.add("Tennis Shoe");
        shoes.add("Running Shoe");
        shoes.add("Dress Shoe");
        shoes.add("Blue Suede Shoe");
        shoes.add("Ballet Shoe");
        shoes.add("SteelToe Shoe");

        System.out.println("\n Different Types of Shoes : " + shoes);

        //Similar to Hashset, Duplicates will be ignored. If the entry is typed
        //differently (ex. tennis vs. Tennis) then both entries would be allowed.
        shoes.add("tennis Shoe");

        System.out.println("\n Different Types of Shoes : " + shoes);

        //The way to counter this addition is to include a Comparator
        SortedSet<String> comparatorShoes = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        comparatorShoes.add("Tennis Shoe");
        comparatorShoes.add("Running Shoe");
        comparatorShoes.add("Dress Shoe");
        comparatorShoes.add("Blue Suede Shoe");
        comparatorShoes.add("Ballet Shoe");
        comparatorShoes.add("SteelToe Shoe");
        comparatorShoes.add("tennis Shoe");

        // the last element is ignored because we are comparing Upper and lower case and in
        //doing so, Tennis and tennis are recognized as the same.
        System.out.println("\n Different Types of Shoes using a Comparator : " + comparatorShoes);

    }

}
