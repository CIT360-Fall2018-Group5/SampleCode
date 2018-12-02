/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author Isabel Jenson
 */

import java.util.HashMap;
import java.util.Map;


public class CarsHashMap {

    
    public static void main(String[] args) {
        //This creates a new HashMap that takes a string as the key and a string as the value. 
        //The name of the HashMap is cars.
        Map<String, String> cars = new HashMap<>();

        // Adding key-value pairs to a HashMap
        cars.put("Volvo", "XC90");
        cars.put("VW", "Jetta");
        cars.put("Subaru", "Crosstrek");
        cars.put("Toyota", "Camry");
        cars.put("Ford", "Focus");

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        cars.putIfAbsent("Hyundai", "Tucson");

        System.out.println(cars);
    }
}
   
