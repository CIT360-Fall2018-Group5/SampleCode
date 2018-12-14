/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrolpattern;

/**
 *
 * @author Isabel Jenson ( https://www.youtube.com/watch?v=AcOkhFGpiek)
 */
public class Multiplication implements doMath {
    
    public void execute(Integer first, Integer second){
     
        Integer multiplication = first * second;
        System.out.println(multiplication);
    
    }

   
}
