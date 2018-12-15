package jUnit;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;


public class JUnitTests {

    @Test
	public void testCompareString() {
		JUnitExample demo = new JUnitExample();
		assertTrue(demo.compareString("italy", "italy"));
		
	}

	
	@Test
	public void testCompareString2() {
		JUnitExample demo = new JUnitExample();
		assertFalse(demo.compareString("italy", "italie"));
		
	}
	


	@Test
	public void testConcatString() {
		JUnitExample demo = new JUnitExample();
		assertEquals("HelloAmerica", demo.concatString("Hello", "America"));
		
	}

	

	@Test 
	public void testAddOneToArray() {
		JUnitExample demo = new JUnitExample();
		int expected[] = new int[] {5,7};
    	assertArrayEquals(expected, demo.addOneToArray(new int[] {4,6}));
		
	}

}

