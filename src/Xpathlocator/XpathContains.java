package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//By using Contains function
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.findElement(By.xpath("//input[contains(@id,'txtU')]")).sendKeys("Admin");
		
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//h4[contains(@class,'h3 mb-3 selenium-webdriver')]"));
	}

}
