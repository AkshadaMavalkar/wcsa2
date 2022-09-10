/*
 1)go to https://me.cleartrip.com/
 2)copy Fly anywhere. Fly everywhere.
 3)pest in another tab i.e google.com(search box)
 
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

public class Homework2 {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://me.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Flights']")).click();
		WebElement clickontext=driver.findElement(By.xpath("//h2[@class='fs-6 px-4 c-neutral-400 fw-400']"));

		Actions act = new Actions(driver);
		act.doubleClick(clickontext).click().perform();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q"));
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
