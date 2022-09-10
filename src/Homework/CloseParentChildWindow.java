package Homework;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentChildWindow {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Open')]")).click();
		String parentHandle = driver.getWindowHandle();
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String handle:allhandles)
		{
			driver.switchTo().window(handle);
			driver.close();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 //self try
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='OrangeHRM, Inc']")).click();
		
		String parent = driver.getWindowHandle(); //we will get id of single window ie.parent
		System.out.println("Address of parent window"+ parent);
		
		for(String child:driver.getWindowHandles())
		{
			driver.switchTo().window(child);
		}
		driver.findElement(By.xpath("//input[@id='myText']")).sendKeys("ABC@gmail.com");
		Thread.sleep(2000);
		driver.close();
		System.out.println("child window gets closed");
		
		driver.switchTo().window(parent);
		System.out.println("Title:"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		System.out.println("Paret and child window gets  closed");

		*/

		
		
	}

}
