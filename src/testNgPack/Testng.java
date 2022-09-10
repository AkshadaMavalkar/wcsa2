package testNgPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng {
  @Test
  public void Method3()
  {
	  Reporter.log("This is method 3",true);
  }
  
  public void Method4()
  {
	  Reporter.log("This is method 4",true);
  }
  
  @Test
  public void Method5()
  {
	  Reporter.log("This is method 5",true);
  }
  
  @Test
  public void Method6()
  {
	  int a=10;
	  int b=0;
	  int res = a/b;
	  System.out.println(res);
	  Reporter.log("This is method 6",true);
  }
  
  
}
