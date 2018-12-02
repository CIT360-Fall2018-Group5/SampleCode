/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Isabel Jenson
 */
public class NatParksTreeSet {
     public static void main(String[] args) {
   
        // This is how a TreeSet is created.
        //The name of the TreeSet is natParksTreeSet.
        SortedSet<String> natParksTreeSet = new TreeSet<>();

        // This is how we add elements to a treeSet.
        natParksTreeSet.add("Denali");
        natParksTreeSet.add("Zion");
        natParksTreeSet.add("Olympic");
        natParksTreeSet.add("Sequoia");
        natParksTreeSet.add("Kenai Fjords");
        natParksTreeSet.add("Bryce Canyon");
        natParksTreeSet.add("Rocky Mountain");       

        //Printing contents of netParksTreeSet
        System.out.println("National Parks : " + natParksTreeSet);
        
        //Adding an element to TreeSet
        // Duplicate elements are ignored.
        natParksTreeSet.add("Kenai Fjords");
        System.out.println("After adding duplicate element \"Kenai Fjords\" : " + natParksTreeSet);

        // Adding this element will be allowed because of lowercase.
        natParksTreeSet.add("zion");
        System.out.println("After adding \"zion\" : " + natParksTreeSet);
    }
}