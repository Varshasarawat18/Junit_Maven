//*******purpose of pkg a and pkg 2 that both class having same test but we need to execute both so we do via runner class

package packageA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import JUnit.StringFunctions;

public class PackageATest {
	
	@Tag("Sanity")
	@Test
	@DisplayName("Package A test1 ")
	public void test1()
	{
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	
}
}