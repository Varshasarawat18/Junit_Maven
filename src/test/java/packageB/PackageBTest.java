//*******purpose of pkg a and pkg 2 that both class having same test but we need to execute both so we do via runner class as we dont have xml file here

package packageB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import JUnit.StringFunctions;

@Tag("Sanity") 
public class PackageBTest {
	
  //Required to run test via runner class
	@Test
	@DisplayName("Package B test1 ")
	public void test1()
	{
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}
	@Test
	@DisplayName("Package B test2 ")
	public void test2()
	{
		assertTrue(StringFunctions.isPalindrom("MOM"));
	}

}
