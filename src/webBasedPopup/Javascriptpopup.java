package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Akshada%20Mavalkar/Desktop/Html%20Document/alert.html");//use alertpopup html file
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(2000);
		Alert A1=driver.switchTo().alert();
		A1.accept();
	//	A1.dismiss();

	}

}
