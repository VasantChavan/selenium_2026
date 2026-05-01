package testng;

import org.testng.annotations.Test;

public class DefaultTestNGTestExecution {
	
	
	/*
		The default execution of testng Test are based on accending order of the alphabet
	*/
	
	@Test
	public void signup()
	{
		System.out.println("Facebook signup ");
	}
	
	@Test
	public void login()
	{
		System.out.println("Facebook login ");
	}
	
	@Test
	public void updateProfile()
	{
		System.out.println("Facebook updateProfile ");
	}
	
	@Test
	public void logout()
	{
		System.out.println("Facebook logout ");
	}

}
