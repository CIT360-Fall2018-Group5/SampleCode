/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author Isabel Jenson (https://www.youtube.com/watch?v=dTVVa2gfht8)
**/

public class MVC {

     

    public static void main(String[] args) {

         

        DiscountCalcView theView = new DiscountCalcView();

         

        DiscountCalcModel theModel = new DiscountCalcModel();

         

        DiscountCalcController theController = new DiscountCalcController(theView,theModel);

         

        theView.setVisible(true);

         
   }

}