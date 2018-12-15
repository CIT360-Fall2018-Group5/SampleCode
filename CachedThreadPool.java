/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
  */

/*
 * @author Isabel Jenson (https://www.journaldev.com/1069/threadpoolexecutor-java-thread-pool-example-executorservice)
 */

package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
public static void main(String[] args) {

ExecutorService service = Executors.newCachedThreadPool();

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