package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
	
	
	
	@DataProvider(name="TestData")
	public String[][] createTestData()
	{
		
		String[][] data =new String[4][3];
		data[0][0]="test@gamil.com";
		data[0][1] ="test@1234%";
		data[0][2] ="Google Page title";
		
		data[1][0]="test-consumer@gamil.com";
		data[1][1] ="test-consumer@123$";
		data[1][2] ="facebook Page title";
		
		data[2][0]="test-consumer@gamil.com";
		data[2][1] ="test-consumer@123$";
		data[2][2] ="facebook Page title";
		
		data[3][0]="test-consumer@gamil.com";
		data[3][1] ="test-consumer@123$";
		data[3][2] ="facebook Page title";
		
		return data;
		
	}
	
	@Test(dataProvider = "TestData",enabled = false)
	public void getGetData(String usr,String psw,String title)
	{
		System.out.println(usr+"  "+psw+"  "+title);
	}
	
	
	
	@DataProvider
	public Object[][] testData()
	{
		Object[][] data = {
				{"Admin","admin123","OrangeHRM",2000},
				{"Test","test@123$","OrangeHRM",20045.45},
				{"test-cardholder","admin123","OrangeHRM",124356},
				{"Admin","admin123","OrangeHRM",1974.45}			
				
		};
		return data;
	}
	
	@Test(dataProvider = "testData")
	public void getTestData(Object user,Object pass,Object title,Object amout) {
		System.out.println(user+" "+pass+"  "+title+" "+amout);
	}

}
