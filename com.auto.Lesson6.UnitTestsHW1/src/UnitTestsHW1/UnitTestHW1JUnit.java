package UnitTestsHW1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class UnitTestHW1JUnit {

	@Test
	public void testMinValue() {
		int actual = Homework1.minValue(4,5);
		int expected = 4;
		
		Assert.assertEquals (expected, actual);
	}
	
	@Test
	public void testSumDividedByK() {
		int[] arr={1,2,3,4,5,6};
		int actual = Homework1.sumDividedByK(arr, 2);
		int expected = 12;
			
		Assert.assertEquals (expected, actual);
		}
	
	@Test
	public void testArrayWithZeros() {
		ArrayList <Integer>  array = (ArrayList<Integer>) Arrays.asList(0,4,0,3,0);
		ArrayList <Integer>  arrayWithZeros = new ArrayList<Integer>();
		ArrayList<Integer> actual = Homework1.arrayWithZeros(array, arrayWithZeros);
		int expected = 3;
			
		Assert.assertEquals (expected, actual);
		}

	@Test
	public void testIsPositiveOrNegative() {
		ArrayList <Integer>  arrayPosOrNeg = (ArrayList<Integer>) Arrays.asList(1,4,0,-3,0,-5,0);
		String actual = Homework1.isPositiveOrNegative(arrayPosOrNeg);
		String expected = "the positive first";
			
		Assert.assertEquals (expected, actual);
		}
	
	
}
