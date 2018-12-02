/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Isabel Jenson
 */
public class FoodHashSet {

    public static void main(String[] args) {
        
        //Creating a ArrayList
        //The name of the ArrayList is "desserts.
        List<String> desserts = new ArrayList<>();
        desserts.add("Banana Split");
        desserts.add("Brownies");
        desserts.add("Ice Cream");
        desserts.add("Cheesecake");
        desserts.add("Pumpkin Pie");

        //Creating a second ArrayList
        //The name of the ArrayList is "entrees".
        List<String> entrees = new ArrayList<>();
        entrees.add("Chicken Alfredo");
        entrees.add("Lasagna");
        entrees.add("Spaguetti");
        entrees.add("Eggplant Parmesiana");
        entrees.add("Mushroom Ravioli");

        //Creating a HashSet from another collection (ArrayList)
        Set<String> saleItems = new HashSet<>(desserts);

        // Adding all the elements from an existing collection to a HashSet
        saleItems.addAll(entrees);

        //Printing contents of saleItems.
        System.out.println(saleItems);
    }
}
