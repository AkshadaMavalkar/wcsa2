package testNgPack;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
  @Test
  public void actitime() 
  {
	  Reporter.log("Enter url",true);
	  SoftAssert softassert = new SoftAssert();
	  softassert.assertEquals(false, true);	//if we use true true then it will not  show error instead it will execute all the remaing code but actually 
	  											//this code should give error so to check that we need to use last sentence i.e softassert.assertAll()..
	  Reporter.log("Enter the title of login page",true);
	  Reporter.log("Enter username",true);
	  Reporter.log("Enter Pasword",true);
	  Reporter.log("Click on login button",true);
	  Reporter.log("verify homepage",true);
	  Reporter.log("create user",true);
	  Reporter.log("delete user",true);
	  Reporter.log("create reports",true);
	  softassert.assertAll();
	  
  }
}
