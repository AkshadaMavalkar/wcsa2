package testNgPack;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActitimeParallelExecution
{
	WebDriver driver;
  @Test
  
  @Parameters({"browser","username","Password","url"})
  
  public void LoginActitime(String browservalue,String username,String Password,String url) throws InterruptedException
  {
	  if(browservalue.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(url);
		  Thread.sleep(3000);
		  driver.findElement(By.name("username")).sendKeys(username); 
		  driver.findElement(By.name("pwd")).sendKeys(Password); 
		  driver.findElement(By.id("loginButton")).click();
		
	  }
	  
	  
	  else if(browservalue.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/gecko.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(url);
		  driver.findElement(By.name("username")).sendKeys(username); 
		  driver.findElement(By.name("pwd")).sendKeys(Password); 
		  driver.findElement(By.id("loginButton")).click();
		
	  }
	  else
	  {
		  Reporter.log("Enter valid input",true);
	  }
	  
	  }
 }