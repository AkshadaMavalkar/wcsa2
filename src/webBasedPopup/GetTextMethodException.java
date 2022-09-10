package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethodException
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Akshada%20Mavalkar/Desktop/Html%20Document/confirmation.html");//used confirmation popup html file
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(2000);
		Alert A1=driver.switchTo().alert();
		A1.accept();
		String text = A1.getText();
		System.out.println(text);
		//getting NoAlertPresentException because before getting text we are closing the popup so we will not get the text of popuwindow
		
	}

}
