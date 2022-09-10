package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//To login
		driver.findElement(By.name("identifier")).sendKeys("AkshadaMavalkar");
		
		
		//for class name (next button) its not working
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		
		
	

	}

}