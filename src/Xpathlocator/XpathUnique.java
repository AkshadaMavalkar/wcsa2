package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUnique {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		
		//By using Unique attribute
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		//for udemy website using unique attribute 
		//driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F");

//		driver.findElement(By.xpath("//input[@id='email--1']")).sendKeys("AkshadaMavalkar");
//		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Xyz1234");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='submit-id-submit']")).click();
	}

}
