package UnitTestsHW1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.Arrays;



@Test
public class UnitTestsHW1TestNG {
	
	
	@Test
	public void testOfNewArrayWithEvenNumbers() {
		ArrayList <Integer>  arrayWithNumbers = (ArrayList<Integer>) Arrays.asList(1,4,-2,3,7,5,13);
		ArrayList <Integer>  arrayWithEvenNumbers = new ArrayList<Integer>();
		Object actual = Homework1.newArrayWithEvenNumbers(arrayWithNumbers, arrayWithEvenNumbers);
		Object expected = 2;
			
		AssertJUnit.assertEquals (actual, expected);
		}
	
	@Test
	public void testOfNewArrayWithEvenNumbersNegative() {
		ArrayList <Integer>  arrayWithNumbersNegative = (ArrayList<Integer>) Arrays.asList(1,3,5);
		ArrayList <Integer>  arrayWithEvenNumbersNegative = new ArrayList<Integer>();
		Object actual = Homework1.newArrayWithEvenNumbers(arrayWithNumbersNegative, arrayWithEvenNumbersNegative);
		Object expected = "there is no even numbers in array";
			
		AssertJUnit.assertEquals (actual, expected);
		}


}
