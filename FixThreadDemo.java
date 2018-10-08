/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExecutorDemo;

/*Author Wayne Thomas code sample from Defog Tech @ https://www.youtube.com/watch?v=6Oo-9Can3H8&list=PLhfHPmPYPPRl0LntrCBnQD5ln6lnqqoms */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixThreadDemo {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            service.execute(new Task());
        }service.shutdown();

    }

    static class Task implements Runnable {

        public void run() {

            System.out.println("Thread Name: " + Thread.currentThread().getName());

        }
    }
}
