package JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedClass {
	
	
	@ValueSource(strings={"radar","mom","dad"})    //strings for string and integer for number
	@ParameterizedTest()
	public void test1(String arg1)
	{
		assertTrue(StringFunctions.isPalindrom(arg1));
	}
		
	@CsvSource(value={"radar:radar:this is comparison string "}, delimiter=':')   //it is a single test but we can compare if all argument correct 
	@ParameterizedTest()
		public void test2(String arg1, String arg2, String arg3)   // here we are doing comparison 
	{
		assertEquals(arg1,arg2,arg3);
	}

}
