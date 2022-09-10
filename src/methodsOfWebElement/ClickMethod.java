package methodsOfWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Akshada%20Mavalkar/Desktop/Html%20Document/flipkartlink.html");
		WebElement link1 = driver.findElement(By.partialLinkText("flip"));
		link1.click();
		
		
		
		
		
		
	}

}
