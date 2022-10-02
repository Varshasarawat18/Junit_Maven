package JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest 
{
	@Test
	public void test1()
	{
		assertEquals(11, Calculator.add(5, 6));
	}			
	

}
