/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo;

/* Author Wayne Thomas code sample from ProgrammingKnowledge @ https://www.youtube.com/watch?v=0ySznjdXMEA&list=PLS1QulWo1RIZcNbNHpnZtc_CkrXwVZLsN&index=2 */

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadClass extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread ID " + Thread.currentThread().getId() + " i value " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
        ThreadClass myThreadExample = new ThreadClass();
        myThreadExample.start();
        ThreadClass myThreadExample1 = new ThreadClass();
        myThreadExample1.start();
        ThreadClass myThreadExample2 = new ThreadClass();
        myThreadExample2.start();
    }

}
