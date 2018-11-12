/*
 * Demonstration code for group meeting where I taught about JUnit Testing
 */
package JUnitDemoPackage;

import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *  @author Wayne Thomas source code provided by https://www.youtube.com/watch?v=LPPji9JESgQ
 */
public class JUnitDemoClassTest {
    
    private JUnitDemoClass classUnderTest;
       
    @Before
    public void setUp()throws Exception{
        
        classUnderTest = new JUnitDemoClass();
    }
    
   
    /**
     * Test of calculate method, of class JUnitDemoClass.
     */
    @Test
    public void testCalculate() {
        double initialValue = 4.3;
        
        BigDecimal expectedValue = BigDecimal.valueOf(4.3 * 100 / Math.PI);
        
        assertTrue(expectedValue.equals(classUnderTest.calculate(initialValue)));
      
    }
    @Test
    public void testCalculate1() {
        double initialValue = 0;
        
        BigDecimal expectedValue = BigDecimal.valueOf(0 * 100 / Math.PI);
        
        assertTrue(expectedValue.equals(classUnderTest.calculate(initialValue)));
      
    }
    @Test
    public void testCalculate2() {
        double initialValue = -1;
        
        BigDecimal expectedValue = BigDecimal.valueOf(-1 * 100 / Math.PI);
        
        assertTrue(expectedValue.equals(classUnderTest.calculate(initialValue)));
      
    }
    @Test
    public void testCalculate3() {
        double initialValue = 8;
        
        BigDecimal expectedValue = BigDecimal.valueOf(8 * 100 / Math.PI);
        
        assertTrue(expectedValue.equals(classUnderTest.calculate(initialValue)));
      
    }
    @Test
    public void testCalculate4() {
        double initialValue = -100;
        
        BigDecimal expectedValue = BigDecimal.valueOf(-100* 100 / Math.PI);
        
        assertTrue(expectedValue.equals(classUnderTest.calculate(initialValue)));
      
    }
    @Test
    public void testCalculate5() {
        double initialValue = 3.14;
        
        BigDecimal expectedValue = BigDecimal.valueOf(3.14 * 100 / Math.PI);
        
        assertTrue(expectedValue.equals(classUnderTest.calculate(initialValue)));
      
    }
    @Test
    public void testCalculate6() {
        double initialValue = 99;
        
        BigDecimal expectedValue = BigDecimal.valueOf(99 * 100 / Math.PI);
        
        assertTrue(expectedValue.equals(classUnderTest.calculate(initialValue)));
      
    }
    
}
