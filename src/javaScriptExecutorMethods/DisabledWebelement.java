package javaScriptExecutorMethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledWebelement {

	public static void main(String[] args)
	{


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Akshada%20Mavalkar/Desktop/Html%20Document/disabledelement.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//disable webElement
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('i1') .value='admin'");
	}
	

}
