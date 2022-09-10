package testNgPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {

	@Test(invocationCount = 5)
	public void f()
	{
		Reporter.log("create and delete user",true);
	}
}