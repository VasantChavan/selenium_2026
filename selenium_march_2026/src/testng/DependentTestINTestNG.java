package testng;

import org.testng.annotations.Test;

public class DependentTestINTestNG {
	
	
	/*
		The default execution of testng Test are based on accending order of the alphabet
	*/
	
	@Test
	public void signup()
	{
		System.out.println("Facebook signup ");
	}
	
	@Test(dependsOnMethods = "signup")
	public void login()
	{
		System.out.println("Facebook login ");
	}
	
	@Test(dependsOnMethods = {"signup","login"})
	public void updateProfile()
	{
		System.out.println("Facebook updateProfile ");
	}
	
	@Test(dependsOnMethods = "updateProfile")
	public void logout()
	{
		System.out.println("Facebook logout ");
	}

}
