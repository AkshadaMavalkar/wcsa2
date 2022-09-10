/*
 1)go to any application
 2)Right click any where on the website
 3)click on the inspect option
 4)Hit the enter button
 */
package robotClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		WebElement gmail=driver.findElement(By.xpath("//div[@class='LX3sZb']/descendant::a[@class='gb_d']"));
		
		Actions act=new Actions(driver);
		act.contextClick(gmail).perform();//right click on gmail option
		Robot robot=new Robot();
		
		for(int i=1;i<=6;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);	
			
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
