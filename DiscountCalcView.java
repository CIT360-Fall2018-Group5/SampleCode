/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/*
 
 @author Isabel Jenson (https://www.youtube.com/watch?v=dTVVa2gfht8)
*/

//The View's only job is to display what the user sees.
//It performs no calculations, but instead passes
//information entered by the user to whomever needs it.

 

import java.awt.event.ActionListener;
import javax.swing.*;


public class DiscountCalcView extends JFrame{

    private JLabel originalPriceLabel = new JLabel("Original price: ");
    
    private JTextField originalPrice  = new JTextField(10);

    private JLabel discountLabel = new JLabel("Discount: ");

    private JTextField discount = new JTextField(10);

    private JButton calculateButton = new JButton("Calculate");

    private JTextField calcSolution = new JTextField(10);

     

    DiscountCalcView(){

         

        // Sets up the view and adds the components

         

        JPanel calcPanel = new JPanel();

         

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(500, 200);

        
        calcPanel.add(originalPriceLabel);

        calcPanel.add(originalPrice);

        calcPanel.add(discountLabel);

        calcPanel.add(discount);

        calcPanel.add(calculateButton);

        calcPanel.add(calcSolution);

         

        this.add(calcPanel);

         

        // End of setting up the components 

         

    }

     

    public Double getFirstNumber(){

         

        return Double.parseDouble(originalPrice.getText());

         

    }

     

    public Double getSecondNumber(){

         

        return Double.parseDouble(discount.getText());

         

    }

     

    public Double getCalcSolution(){

         

        return Double.parseDouble(calcSolution.getText());

         

    }

     

    public void setCalcSolution(Double solution){

         

        calcSolution.setText(Double.toString(solution));

         

    }

     

    // If the calculateButton is clicked execute a method

    // in the Controller named actionPerformed

     

    void addCalculateListener(ActionListener listenForCalcButton){

         

        calculateButton.addActionListener(listenForCalcButton);

         

    }

     

    // Open a popup that contains the error message passed

     

    void displayErrorMessage(String errorMessage){

         

        JOptionPane.showMessageDialog(this, errorMessage);

         

    }

    
}

