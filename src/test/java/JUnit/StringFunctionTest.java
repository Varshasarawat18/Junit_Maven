package JUnit;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class StringFunctionTest {
	
	@Test
	public void test1()
	{
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}
	@Test
	public void test2()
	{
		assertFalse(StringFunctions.isPalindrom("PRIYA"));
	}
	
	@DisplayName("Example of repeated test")
	@RepeatedTest(4)    //Here 4 given repeated test will run four times
	public void test3()
	{
		assertTrue(StringFunctions.isPalindrom("MOM"));
	}
	
}
