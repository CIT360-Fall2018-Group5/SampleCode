/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunnableDemo;

/*Author Wayne Thomas code sample from ProgrammingKnowledge @ https://www.youtube.com/watch?v=UXW5a-iHjso&index=3&list=PLS1QulWo1RIZcNbNHpnZtc_CkrXwVZLsN  */

import java.util.logging.Level;
import java.util.logging.Logger;

public class RunnableDemo {

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {

            public void run() {
                for (int i = 10; i < 20; i++) {
                    System.out.println("Thread ID " + Thread.currentThread().getId() + " i value " + i);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Runnable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        threadOne.start();
    }

}
