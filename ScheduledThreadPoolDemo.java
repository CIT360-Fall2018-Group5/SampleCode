/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExecutorDemo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.util.concurrent.TimeUnit.SECONDS;

/*Author Wayne Thomas code sample from Defog Tech @ https://www.youtube.com/watch?v=6Oo-9Can3H8&list=PLhfHPmPYPPRl0LntrCBnQD5ln6lnqqoms */

public class ScheduledThreadPoolDemo {
    
    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        for (int i = 0; i < 100; i++) {
            service.schedule(new Task(),10, SECONDS);
            /* Other schedule options include:
            service.scheduleAtFixedRate(new Task(),"initial delay:" 10, "period:" 10, SECONDS);
            service.scheduleWithFixedDelay(new Task(),"initial delay" 10, "delay:" 10, TimeUnit.SECONDS);
            */
        }service.shutdown();
    }

    static class Task implements Runnable {

        public void run() {

            System.out.println("Thread Name: " + Thread.currentThread().getName());

        }
    }
}
