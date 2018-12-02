/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Isabel Jenson
 */
public class EssentialOilsArrayList {
    
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> essentialOils = new ArrayList<>();

        // Adding new elements to the ArrayList
        essentialOils.add("Lavender");
        essentialOils.add("Bergamot");
        essentialOils.add("Wintergreen");
        essentialOils.add("OnGuard");

        System.out.println(essentialOils);

        // Adding an element at a particular index in an ArrayList
        essentialOils.add(1, "Lemongrass");

        System.out.println(essentialOils);

    }
}
    
