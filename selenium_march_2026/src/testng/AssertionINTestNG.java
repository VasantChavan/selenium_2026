package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionINTestNG {
	
	
	@Test
	public void test1()
	{
		String expTitle="Facebook";
		String actTitle="Facebook";
		
		Assert.assertEquals(actTitle, expTitle," Expected title doesn't matched with actual title..");
			
	}
	
	@Test
	public void test2()
	{
		String expTitle="Facebook";
		String actTitle="Facebook";
		
		Assert.assertEquals(actTitle, expTitle," Expected title doesn't matched with actual title..");
		
	}
	
	@Test
	public void test3()
	{
		Assert.assertTrue(true,"Expecting true as boolean conodition ...");
	}
	
	@Test
	public void test4()
	{
		Assert.assertTrue(true,"Expecting true as boolean conodition ...");
	}
	
	@Test
	public void test5()
	{
		Assert.assertFalse(false,"Expecting true as boolean conodition ...");
	}
	
	@Test
	public void test6()
	{
		Assert.assertFalse(false,"Expecting true as boolean conodition ...");
	}

}
