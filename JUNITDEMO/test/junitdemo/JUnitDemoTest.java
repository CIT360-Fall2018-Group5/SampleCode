/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitdemo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wayne Thomas sandbox code provided by
 * https://www.youtube.com/watch?v=KBx1pWhNUMc&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA
 * https://www.youtube.com/watch?v=FZVjICj_1vE&index=2&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA
 * https://www.youtube.com/watch?v=6RcjjpgOj5c&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA&index=3
 * https://www.youtube.com/watch?v=skF3VZbfVqc&index=4&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA
 * https://www.youtube.com/watch?v=1H73r2RGlNQ&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA&index=5
 * https://www.youtube.com/watch?v=iiroi_RWIpo&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA&index=6
 */
public class JUnitDemoTest {

    @Test
    public void testCompareString() {
        JUnitDemo demo = new JUnitDemo();
        assertTrue(demo.compareString("hello", "hello"));
    }

    @Test
    public void testCompareString2() {
        JUnitDemo demo = new JUnitDemo();
        assertFalse(demo.compareString("hello", "goodbye"));
    }

    @Test
    public void testConcatString() {
        JUnitDemo demo = new JUnitDemo();
        assertEquals("HelloWorld", demo.concatString("Hello", "World"));
    }

    @Test
    public void testAddOneToArray() {
        JUnitDemo demo = new JUnitDemo();
        int expected[] = new int[]{3, 8};
        assertArrayEquals(expected, demo.addOneToArray(new int[]{2, 7}));
    }

    @Test(timeout = 10)
    public void testPerformance() {
        JUnitDemo demo = new JUnitDemo();
        demo.performance();
    }

    @Test(expected = ArithmeticException.class)
    public void testException() {
        JUnitDemo demo = new JUnitDemo();
        demo.exception(0);
    }

}
