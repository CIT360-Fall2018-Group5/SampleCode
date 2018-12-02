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
import java.util.LinkedList;
import java.util.Queue;

public class DestinationsQueue {
    public static void main(String[] args) {
        // Used LinkedList to Create and initialize a QueueDestinations.
        Queue<String> destinationsQueue = new LinkedList<>();

        // Used .add to add elements to QueueDestinations.
        destinationsQueue.add("Greece");
        destinationsQueue.add("Rome");
        destinationsQueue.add("Canada");
        destinationsQueue.add("London");
        destinationsQueue.add("New York");
        
        //Display the elements in the queue.
        System.out.println("Destinations Queue : " + destinationsQueue);

        // Removing an element from the DestinationsQueue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the DestinationsQueue is empty
        String name = destinationsQueue.remove();
        System.out.println("Removed from DestinationsQueue : " + name + " | New DestinationsQueue : " + destinationsQueue);

        // Removing an element from the QueueDestinations using poll()
        // The poll() method is similar to remove() except that it returns null if the QueueDestinations is empty.
        name = destinationsQueue.poll();
        System.out.println("Removed from DestinationsQueue: " + name + " | New DestinationsQueue: " + destinationsQueue);
    }
}
