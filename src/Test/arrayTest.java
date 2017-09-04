package Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import Main.Array;

import org.junit.Before;
import org.junit.Test;

public class arrayTest {
	Array testcase;

	@Before
	public void setUp() throws Exception {
		 testcase = new Array(2);
		
	}

	@Test
	public void testGetArray() {
		int[] testarray= new int[2];
		testarray[0]=1;
		testarray[1]=2;
		assertArrayEquals(testarray, testcase.getArray());
	}
	
	
	@Test
	public void testRandomNumbers() {
		assertNotNull(testcase.randomNumbers(4, 6));
	}
	
	@Test
	public void testsortedByFinishedMethod() {
		Array testcases = new Array(6);
		testcases.randomNumbers(5, 10);
		int[] testtable= new int[6];
		testtable=testcases.getArray();
		Arrays.sort(testtable);
		assertArrayEquals(testtable,testcases.sortedByFinishedMethod());
	
	}
	
	
	@Test
	public void testbubbleSort() {
		Array testcases = new Array(2000);
		testcases.randomNumbers(5, 100000);
		int[] testtable= new int[2000];
		testtable=testcases.getArray();
		Arrays.sort(testtable);
		assertArrayEquals(testtable,testcases.bubbleSort());
			
	}

	
	@Test
	public void testinsertSort() {
		Array testcases = new Array(10000000);
		testcases.randomNumbers(5, 100000);
		int[] testtable= new int[10000000];
		testtable=testcases.getArray();
		Arrays.sort(testtable);
		assertArrayEquals(testtable,testcases.insertSort());
			
	}

}
