package MVCDemo.View;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Wayne Thomas sandbox code provided by https://www.youtube.com/watch?v=dTVVa2gfht8
 */
public class CalculatorView extends JFrame {

    private JLabel heading = new JLabel("Welcome To My Sandbox Demo of MVC! ");
    private JLabel subheading = new JLabel("This Demo will add two numbers together and give you the sum. ");
    private JLabel firstNumLabel = new JLabel("Please enter your first number here. ");
    private JLabel secondNumLabel = new JLabel("Please enter your second number here. ");
    private JLabel sumLabel = new JLabel("Here is the sum.");

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(15);

    public CalculatorView() {

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);

        calcPanel.add(heading);
        calcPanel.add(subheading);
        calcPanel.add(firstNumLabel);
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(sumLabel);
        calcPanel.add(calcSolution);

        this.add(calcPanel);

    }

    public int getFirstNumber() {

        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {

        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalcSolution() {

        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution) {

        calcSolution.setText(Integer.toString(solution));
    }

    public void addCalculationListener(ActionListener listenerForCalcButton) {

        calculateButton.addActionListener(listenerForCalcButton);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
