package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class Page 
{
 
	@Parameters({"browser", "url"})
  @BeforeMethod
  public void openBrowser(String browser, String url) 
  {
	  System.out.println("BefoeMethod - browser open.."+browser);
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  System.out.println("AfterMethod - browser close");
  }

  @Parameters({"WBpath"})
  @BeforeClass
  public void makeWBconnection(String WBpath) 
  {
	  System.out.println("BeforeClass -> makeWBConnection" +WBpath);
  }

  @AfterClass
  public void closeWBConnection() 
  {
	  System.out.println("AfterClass -> closeWBConnection");
  }

  @Parameters({"filename","key"})
  @BeforeTest
  public void generateReport(String filename, String key) 
  {
	  System.out.println("BeforeTest -> generateReport" +filename);
  }

  @AfterTest
  public void closeReport() 
  {
	  System.out.println("AfterTest -> closeReport");
  }

}
