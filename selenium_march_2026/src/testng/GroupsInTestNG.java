package testng;

import org.testng.annotations.Test;

public class GroupsInTestNG {
	
		
	@Test(groups = "sanity")
	public void sanityGroup()
	{
		System.out.println("sanityGroup()");
	}
	
	@Test(groups = {"regression"})
	public void regressionGroup()
	{
		System.out.println("regressionGroup()");
	}
	
	@Test(groups = {"smoke"})
	public void smokeGroup()
	{
		System.out.println("smokeGroup()");
	}
	
	@Test(groups = {"end2end"})
	public void end2endGroup()
	{
		System.out.println("end2endGroup()");
		
	}
	@Test(groups = {"smoke","sanity"})
	public void smokeandsanity()
	{
		System.out.println("smokeandsanity()");
	}

}
