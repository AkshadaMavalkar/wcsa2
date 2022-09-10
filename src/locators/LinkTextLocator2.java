package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator2 {

	public static void main(String[] args) throws InterruptedException
	{
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//this is for udemy website link
		driver.get("https://www.udemy.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Python")).click();


	}

}
