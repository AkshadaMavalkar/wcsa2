package testNgPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo
{
  @Test
  public void f()
  {
	  //we dont use main method in testNg
	  //to check report right click on folder and >right click on html file open with web browser 
	  //sout is not recommended in TestNG
	 // System.out.println("I am in f method");//output will generate on console and will not display in report
	//  Reporter.log("I am in f method");//output will generate in reportnot in console 
	  	Reporter.log("I am in f method",true);//output will display in both window i.e console and report
	  
	  
  }
}
