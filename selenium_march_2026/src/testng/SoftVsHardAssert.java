package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftVsHardAssert {

	@Test
	public void hardAssert() {
		System.out.println(" statement before hard assertion...");
		Assert.assertTrue(true);
		System.out.println("statement after hard assert will get execute");

		Assert.assertTrue(false);
		System.out.println("statement after hard assert will not get execute");
	}

	@Test
	public void softAssert() {
		System.out.println("statement before soft assertion...");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(true);

		System.out.println("statement after soft assert will get execute");

		softAssert.assertTrue(false);

		System.out.println("statement after soft assert will get execute");
		
		softAssert.assertAll();

	}

}
