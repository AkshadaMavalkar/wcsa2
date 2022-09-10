package Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartSwitchtodiffpage {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone12"); 
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[.='1. APPLE iPhone 13 (Pink, 128 ...']")).click();


		String parent = driver.getWindowHandle(); //we will get id of single window ie.parent

		for(String child:driver.getWindowHandles())
		{
			driver.switchTo().window(child);
		}
		driver.findElement(By.xpath("//li[@id='swatch-3-color']")).click();
		driver.findElement(By.xpath("//a[.='256 GB']")).click();
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("410506"); 
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		//driver.findElement(By.className("_3dsJAO")).click();
		// driver.findElement(By.xpath("//div[.='Remove' and @class='_3dsJAO']")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Remove')]")).click();

		
		driver.findElement(By.xpath("//div[@class='_10vWcL td-FUv WDiNrH']/descendant::div[contains(text(),'Remove')]")).click();
		}

}
