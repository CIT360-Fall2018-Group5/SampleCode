/*
 * Demonstration code for group meeting where I taught about JUnit Testing.
 */
package JUnitDemoPackage;

import java.math.BigDecimal;

/*
 *
 * @author Wayne Thomas source code provided by https://www.youtube.com/watch?v=LPPji9JESgQ
 */
public class JUnitDemoClass {
    
     //Source code created for JUnit Testing Demo 
    public BigDecimal calculate(double operand) {
        BigDecimal ret;

        double calculatedValue = operand * 100 / Math.PI;

        ret = BigDecimal.valueOf(calculatedValue);

        return ret;

    }

}
