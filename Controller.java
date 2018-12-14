/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrolpattern;
import java.util.HashMap;
/**
 *
 * @author Isabel Jenson (https://www.youtube.com/watch?v=AcOkhFGpiek&t=302s)
 */
public class Controller {
    
    public static HashMap <String, doMath> key = new HashMap <String, doMath>();
    
        public void Controller(){
        }
        
        public static void handleOperator(String operand, Integer first, Integer second){
    
        key.put("+", new Addition());
        key.put("-", new Subtraction());
        key.put("*", new Multiplication());
        key.put("/", new Division());
      
        
       
        doMath handler = key.get(operand);
        handler.execute(first,second);
        
        }

    
}
