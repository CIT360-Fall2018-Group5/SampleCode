/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author Isabel Jenson (https://www.youtube.com/watch?v=dTVVa2gfht8)
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions between the View and Model.

public class DiscountCalculatorController {

     
    private DiscountCalculatorView theView;
    private DiscountCalculatorModel theModel;
     

    public DiscountCalculatorController(DiscountCalculatorView theView, DiscountCalculatorModel theModel) {

        this.theView = theView;
        this.theModel = theModel;

         
       // Tell the View that when ever the calculate button

        // is clicked to execute the actionPerformed method

        // in the CalculateListener inner class

         

        this.theView.addCalculateListener(new CalculateListener());

    }

     

    class CalculateListener implements ActionListener{

 

       
        public void actionPerformed(ActionEvent e) {

             

            double originalPrice, discount = 0;
            

             

            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered.

             

            try{
               

             

                originalPrice = theView.originalPrice();

                discount = theView.discount();

                 

                theModel.calcDiscount(originalPrice, discount);

                 

                theView.setCalcSolution(theModel.getDiscountedTotal());

             

            }

 

            catch(NumberFormatException ex){

                 

                System.out.println(ex);

                 

                theView.displayErrorMessage("You Need to Enter 2 numbers");

                 

            }

             

        }

         

    }

     

}

