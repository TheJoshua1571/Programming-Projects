package ceLinearBinary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class SearchTest {
	
	int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	
	@Test
	void testlinear_firstElement() {
		int key = 1;
		assertEquals(0, Search.linear(num, key));
	}
	
	@Test
	void testlinear_middleElement() {
		int first = 0;
		int last = num.length -1;
		int middle = (first + last) / 2;
		int key = middle;
		assertEquals(middle, Search.linear(num, key)+1);
	}
	
	@Test
	void testlinear_lastElement() {
		int key = num.length;
		assertEquals(num.length -1, Search.linear(num, key));
	}
	
	
	@Test
	void testlinear_elementNotInArray() {
		int key = num.length + 1;
		assertEquals(-1, Search.linear(num, key));
	}
	@Test
	void testlinear_emptyArray() {
		int [] num1 = {};
		assertEquals(0, Search.linear(num1, 0));
	}
	
	int[] numbin = {2,5,4,9,8,63,44};
	
	@Test
	void testbinary_firstElement() {
		int key = 2;
		assertEquals(0, Search.binary(numbin, key));
	}
	
	@Test
	void testbinary_middleElement() {
		Arrays.sort(numbin);
		int first = 0;
		int last = numbin.length -1;
		int middle = (first + last) / 2;
		int key = numbin[middle];
		assertEquals(middle, Search.binary(numbin, key));
	}
	
	@Test
	void testbinary_lastElement() {
		Arrays.sort(numbin);
		int key = 0;
		for (int i = 0; i<numbin.length;i++) {
			 key = numbin[i];
		}	
		assertEquals(numbin.length - 1, Search.binary(numbin, key));
	}
	
	@Test
	void testbinary_elementNotInArray() {
		int key = numbin.length - (numbin.length - 1);
		assertEquals(-1, Search.binary(numbin, key));
	}
	@Test
	void testbinary_emptyArray() {
		int [] num1 = {};
		assertEquals(0, Search.binary(num1, 0));
	}
	
	/*
	@Test
	void testlinear_anyElement() {
		int key = 5;
		assertEquals(Search.linear(num, key), 5);
	}
	*/
	
}
