/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationControllerPattern.demo;

import java.util.HashMap;

/**
 *
 * @author Wayne Thomas Code Sample Provided by
 * https://www.youtube.com/watch?v=AcOkhFGpiek
 */
public class ControllerDemo {

    public static HashMap<String, Calculator> key = new HashMap<String, Calculator>();

    public void Controller() {

    }

    public static void handleOperator(String operand, Double firstNumber, Double secondNumber) {

        key.put("+", new AdditionClass());
        key.put("-", new SubtractionClass());
        key.put("*", new MultiplicationClass());
        key.put("/", new DivisionClass());

        Calculator calculate = key.get(operand);
        calculate.execute(firstNumber, secondNumber);

    }

    

}
