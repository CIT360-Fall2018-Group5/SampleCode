/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Isabel Jenson
 */
public class NewAquisitionProjectsTreeMap {

    public static void main(String[] args) {
        
        //Creating "projects"TreeMap
        TreeMap<Integer, String> projects = new TreeMap<>();
        
        //Adding elements to TreeMap
        projects.put(1998, "Employee pay increases");
        projects.put(1999, "Lunchr room remodel");
        projects.put(2000, "Marketing budget increase");
        projects.put(2001, "Landscaping");
        projects.put(2002, "New lobby furniture");
        
        //Printing contents of "projects"TreeMap to screen.
        System.out.println("New aquisition projects : " + projects);

        // This finds the total amount of elements in TreeMap
        System.out.println("Total number of projects to be completed in 2019 : " + projects.size());

        // Check if the given key exists in a TreeMap
        Integer id = 2000;
        if(projects.containsKey(id)) {
            // Get the value associated with a given key in a TreeMap
            String title = projects.get(id);
            System.out.println("Project with id " + id + " : " + title);
        } else {
            System.out.println("Project id doesn' exist: " + id);
        }

        // Find the first and last entry
        System.out.println("First entry in projects map : " + projects.firstEntry());
        System.out.println("Last entry in projects map : " + projects.lastEntry());

        // Find the entry whose key is just less than the given key
        Map.Entry<Integer, String> projectJustBelow = projects.lowerEntry(2000);
        System.out.println("Employee just below id 2000 : " + projectJustBelow);

        // Find the entry whose key is just higher than the given key
        Map.Entry<Integer, String> projectJustAbove = projects.higherEntry(2000);
        System.out.println("Employee just above id 2000 : " + projectJustAbove);
    }


}

