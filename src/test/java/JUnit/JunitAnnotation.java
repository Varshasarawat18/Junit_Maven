package JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitAnnotation {
	
	
	@BeforeAll()
	public static void beforeAllJunit()
	{
		System.out.println("before all junit");
	}
	
	
	@BeforeEach()
	public void beforeJunit()
	{
		System.out.println("before junit");
	}
	
	@Test
	public void test1()
	{
		assertEquals(11, Calculator.add(5, 6));
	}	
	
	@AfterEach()
	public void AfterJunit()
	{
		System.out.println("After junit");
	}
	
	@BeforeAll()
	public static void AfterAllJunit()    //in junit 5 static is required for before all and aftet all othwerwise wont work . annotations work withing the class not outside the class
	{
		System.out.println("After all junit");
	}
	

}
