/*
 * Addition class example used in Application Controller Pattern Demo
 */
package ApplicationControllerPattern.demo;

/**
 *
 * @author Wayne Thomas Code Sample Provided by https://www.youtube.com/watch?v=AcOkhFGpiek
 */
public class AdditionClass implements Calculator {
    public void execute(double firstNumber, double secondNumber){
                
                   double answer = firstNumber + secondNumber;
                   System.out.println(answer);
      }
    
}
