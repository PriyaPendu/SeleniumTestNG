package testcases;

import org.testng.annotations.Test;

import core.Page;

public class ShopTest extends Page
{
  @Test(priority = 3)
  public void qordertest()
  {
	  System.out.println("Test -> add to kart....");
  }
  
  @Test (priority = 4)
  public void paymentTest()
  {
	  System.out.println("Test -> payment Test..");
  }
  
  @Test (priority = 5)
  public void deliverstatus()
  {
	  System.out.println("Test -> delivery status..");
  }
}
