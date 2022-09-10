package Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instgram {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.findElement(By.name("username")).sendKeys("abcd1234"); 
	    driver.findElement(By.name("password")).sendKeys("123456789"); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//button[.='Log In']")).click();

	}

}
