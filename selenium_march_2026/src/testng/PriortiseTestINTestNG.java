package testng;

import org.testng.annotations.Test;

public class PriortiseTestINTestNG {
	
	
	
	@Test(priority = -1)
	public void signup()
	{
		System.out.println("Facebook signup ");
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("Facebook login ");
	}
	
	@Test(priority = 3)
	public void updateProfile()
	{
		System.out.println("Facebook updateProfile ");
	}
	
	@Test(priority = -2)
	public void logout()
	{
		System.out.println("Facebook logout ");
	}
	
	@Test
	public void changeProfilePicture()
	{
		System.out.println("changeProfilePicture");
	}
	
	@Test
	public void accountCreation()
	{
		System.out.println("accountCreation");
	}

}
