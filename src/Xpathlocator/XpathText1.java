package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		//for selenium webdriver on selenium.dev
		//driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']"));
		//driver.findElement(By.xpath(".='Selenium WebDriver']"));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//for selenium webdriver on orangehrm (( Username : Admin | Password : admin123 )
		//driver.findElement(By.xpath("//span[text()='( Username : Admin | Password : admin123 )']")).sendKeys("Admin");
		driver.findElement(By.xpath(".='( Username : Admin | Password : admin123 )']")).sendKeys("Admin");

	}

}
