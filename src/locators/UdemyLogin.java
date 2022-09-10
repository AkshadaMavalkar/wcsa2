package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F");
		//To login
		driver.findElement(By.id("email--1")).sendKeys("AkshadaMavalkar");
		driver.findElement(By.name("password")).sendKeys("Xyz1234");
		Thread.sleep(3000);
		driver.findElement(By.id("submit-id-submit")).click();
		
		


		

	}

}