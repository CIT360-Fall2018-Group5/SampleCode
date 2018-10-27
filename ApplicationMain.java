/*
 * This contains the main method of the Application Controller. 
 */
package ApplicationControllerPattern.demo;

import java.util.*;

/**
 *
 * @author Wayne Thomas Code Sample Provided by https://www.youtube.com/watch?v=AcOkhFGpiek
 * 
 */
public class ApplicationMain {
    
    public static void main(String[] args){
        
       int x = 1;
       
       do{
        try {
    
        Scanner input = new Scanner(System.in);
        
        ControllerDemo answer = new ControllerDemo();
        
        Double firstNumber;
        Double secondNumber;
        
        String operand;
        
        System.out.println("\n Welcome! \n\n\n Please enter a number. ");
        
        firstNumber = Double.parseDouble(input.nextLine());
        
        System.out.println("\n Please enter a second number. ");
        
        secondNumber = Double.parseDouble(input.nextLine());
        
        System.out.println("\n Wonderful! Now what would you like to do? Add (+), Subtract (-), Multiply (*), or Divide (/) ");
        
        operand = input.nextLine(); 
                       
        System.out.println("\n Well ok then. You answer is : " );
        
        answer.handleOperator(operand, firstNumber, secondNumber);
        
        x = 2; //exits the do while loop if 
            
    }catch (Exception e) {
        
        System.out.println(" \n Please enter a valid number \n " );
        
    } }while(x == 1);


}
}