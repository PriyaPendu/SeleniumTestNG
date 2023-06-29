package testcases;

import org.testng.annotations.Test;

import core.Page;

import org.testng.annotations.DataProvider;

public class LoginTest extends Page
{
  @Test(dataProvider = "loginData" , priority = 2)
  public void logintest(String uid, String pwd) 
  {
	  System.out.println("Test -> logintest using uid "+uid+" pwd" +pwd);
  }

  
  @DataProvider
  public Object[][] loginData() throws Exception {
    return utility.POIConfig.getData("C:\\Users\\Circle\\Desktop\\Priya\\Excel\\Book.xlsx", "Record");
  }
  
  @Test(dataProvider = "signinData" ,priority = 1)
  public void signin(String name, int age, double marks)
  {
	  System.out.println("Signin test... name "+name+" age"+age+ "marks" +marks);
  }
  
  @DataProvider
  public Object[][] signinData() {
    return new Object[][] 
    		{
      new Object[] { "Ram", 32, 89.45 },
      new Object[] { "Krishn", 56, 45.89 },
      new Object[] { "Krishn", 12, 98.32 },
    };
  }
}
