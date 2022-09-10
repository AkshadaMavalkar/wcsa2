package parameterTestng;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void test1()
	{
		Reporter.log("@Test",true);
	}	

	@BeforeTest
	public void test3()
	{
		Reporter.log("@BeforeTest",true);
	}
	
	@BeforeClass
	public void test4()
	{
		Reporter.log("@BeforeClass",true);
	}
	
	@BeforeMethod
	public void test5()
	{
		Reporter.log("@BeforeMethod",true);
	}
	

	@AfterTest
	public void test7()
	{
		Reporter.log("@AfterTest",true);
	}
	
	
	@AfterClass
	public void test8()
	{
		Reporter.log("@AfterClass",true);
	}
	@AfterMethod
	public void test9()
	{
		Reporter.log("@AfterMethod",true);
	}
	


		
	

	
}
