package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameteriseTestInTestNG {
	
	
	
	@Test
	@Parameters({"firstname","lastname"})
	public void test(@Optional("Harhsa")String fName,@Optional("Naga") String lName)
	{
		System.out.println("First name is "+fName);
		System.out.println("Last name is "+lName);
	}

}
