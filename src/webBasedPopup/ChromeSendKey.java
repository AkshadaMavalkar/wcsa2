//we are not able to send keys in chrome so we are using robot class and through username we are copy in text and sending it to poup...
package webBasedPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeSendKey
{	
		public static void main(String[] args) throws InterruptedException, AWTException
		{			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://omayo.blogspot.com");
			driver.findElement(By.xpath("(//form[@name='form1']/input)[1]")).sendKeys("automation");//xpath of username 
			new Actions(driver).doubleClick(driver.findElement(By.xpath("(//form[@name='form1']/input)[1]"))).perform();
			Thread.sleep(5000);
			
			Robot rob = new Robot();
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_C);
			rob.keyRelease(KeyEvent.VK_C);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);	
			
			driver.findElement(By.id("prompt")).click();//xpath of get prompt button
			Thread.sleep(3000);
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_CONTROL);

	}

}
