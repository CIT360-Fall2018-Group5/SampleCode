/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueueDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * * @author Wayne Thomas Code Sample Provided by
 * https://www.callicoder.com/java-Queue
 */
public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> customerQueue = new LinkedList<>();

        //add elements to the Queue (Enqueue operation)
        customerQueue.add("Bob");
        customerQueue.add("Greg");
        customerQueue.add("Cindy");
        customerQueue.add("Sandra");
        customerQueue.add("Nancy");
        customerQueue.add("James");
        customerQueue.add("Kristen");

        System.out.println("\n Customers in queue: " + customerQueue);

        //remove an element using remove() (Dequeue Operation)
        String name = customerQueue.remove();

        System.out.println("\n Thank you for coming in today ! " + name + " | Who is next?  " + customerQueue);

        //remove an element using poll()
        name = customerQueue.poll();

        System.out.println("\n Thank you for coming in today ! " + name + " | Who is next?  " + customerQueue);

        //using forEach to iterate over the Queue
        System.out.println("\n Iterating over Queue using forEach ");

        customerQueue.forEach(customer -> {

            System.out.println(customer);

        });
        
        System.out.println("\n Iterating over Queue using an Iterator");
        
        Iterator<String> customerQueueIterator = customerQueue.iterator();
        
        while (customerQueueIterator.hasNext()){
            String customer = customerQueueIterator.next();
            System.out.println(customer);
        
        }
                
    }

}
