package MVCDemo.Controller;

import MVCDemo.Model.CalculatorModel;
import MVCDemo.View.CalculatorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Wayne Thomas sandbox code provided by https://www.youtube.com/watch?v=dTVVa2gfht8
 */
public class CalculatorController {
    
    private CalculatorView theView;
    private CalculatorModel theModel;
    
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel){
    
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addCalculationListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            int firstNumber, secondNumber = 0;
            try{
                
            firstNumber = theView.getFirstNumber();
            secondNumber = theView.getSecondNumber();
            
            theModel.addTwoNumbers(firstNumber, secondNumber);
            
            theView.setCalcSolution(theModel.getCalculationValue());            
            
            }catch(NumberFormatException ex){
                theView.displayErrorMessage("You Need to Enter Two Intergers");
                
            }
        }
    
    }
}
