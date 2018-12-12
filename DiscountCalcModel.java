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
// The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists

 

public class DiscountCalcModel {

    // Holds the value of the sum of the numbers
    // entered in the view

     
    private Double discountedTotal;

     

    public void addTwoNumbers(Double firstNumber, Double secondNumber){
        
         

        discountedTotal = firstNumber - (firstNumber * secondNumber)/100;         

    }

     

    public Double getDiscountedTotal(){

        
        return discountedTotal;

         

    }
    
}

     

