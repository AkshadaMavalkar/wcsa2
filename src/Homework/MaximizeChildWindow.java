package Homework;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MaximizeChildWindow {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Open')]")).click();
		String parentHandle = driver.getWindowHandle();
		
		 Set<String> allhandles = driver.getWindowHandles();
		
		for(String handle:allhandles)
		{
			if(!parentHandle.equals(handle))
			{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				
			}
			else
			{
				
			}
		}
		
		
		
		
		/*
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		Thread.sleep(2000);
	
		WebElement rightclick = driver.findElement(By.xpath("//a[.='OrangeHRM, Inc']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		
		Robot robot=new Robot();
		
		for(int i=1;i<=2;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);	
			
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	
		String parent = driver.getWindowHandle(); //we will get id of single window ie.parent
		System.out.println("Address of parent window"+ parent);
		
		
		for(String child:driver.getWindowHandles())
		{
			driver.switchTo().window(child);
			Thread.sleep(2000);
		
		}
		driver.findElement(By.xpath("//input[@id='myText']")).sendKeys("ABC@gmail.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		*/
		
		
	
		
	
		
		

	}

}
