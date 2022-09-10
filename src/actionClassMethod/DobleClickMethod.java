package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DobleClickMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement DC = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(DC).doubleClick().perform();  //double click
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//System.out.println(driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText());
	    //or
	    
		String output = driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
		System.out.println(output);
		
	}
}
