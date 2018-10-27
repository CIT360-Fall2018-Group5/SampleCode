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
    
}
