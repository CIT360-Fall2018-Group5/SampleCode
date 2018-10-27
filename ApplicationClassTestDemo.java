/*
 * This test the ApplicationControllerPattern execute methods for
 * AdditionClass, SubtractionClass, MultiplicationClass, and DivisionClass
 */
package ApplicationControllerPattern.demo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wayne Thomas
 */
public class ApplicationClassTestDemo {

    @Before
    public void setUp() {
    }

    /**
     * Test of execute method, of class AdditionClass.
     */
    @Test
    public void testExecute() {
        System.out.println("Execute Test One: Addition");
        double firstNumber = 1;
        double secondNumber = 2;
        AdditionClass instance = new AdditionClass();
        instance.execute(firstNumber, secondNumber);

    }

    /**
     * Test of execute method, of class SubtractionClass.
     */
    @Test
    public void testExecute2() {
        System.out.println("Execute Test Two : Subtraction");
        double firstNumber = 5;
        double secondNumber = 2;
        SubtractionClass instance = new SubtractionClass();
        instance.execute(firstNumber, secondNumber);

    }

    /**
     * Test of execute method, of class MultiplicationClass.
     */
    @Test
    public void testExecute3() {
        System.out.println("Execute Test Three : Multiplication");
        double firstNumber = 1;
        double secondNumber = 3;
        MultiplicationClass instance = new MultiplicationClass();
        instance.execute(firstNumber, secondNumber);

    }

    /**
     * Test of execute method, of class DivisionClass.
     */
    @Test
    public void testExecute4() {
        System.out.println("Execute Test Four : Division");
        double firstNumber = 9;
        double secondNumber = -1;
        DivisionClass instance = new DivisionClass();
        instance.execute(firstNumber, secondNumber);

    }
}
