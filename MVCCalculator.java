package MVCDemo.Main;

import MVCDemo.View.CalculatorView;
import MVCDemo.Model.CalculatorModel;
import MVCDemo.Controller.CalculatorController;

/**
 *
 * @author Wayne Thomas sandbox code provided by https://www.youtube.com/watch?v=dTVVa2gfht8
 */
public class MVCCalculator {

    public static void main(String[] args) {

        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);

    }

}
