package practicePrograms;


import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.google.com/");
																																																																																	
//		String titlepage = driver.getTitle();
//		System.out.println("Title of webpage is"+titlepage);
//		driver.close(); 
		
//		String urlOf = driver.getCurrentUrl();
//		System.out.println( urlOf);
//		
//		
//		String pagesource = driver.getPageSource();
//		System.out.println( pagesource);
//		
		
//		driver.switchTo().activeElement().sendKeys("guitar",Keys.ENTER);// return type target locator
//		Thread.sleep(2000);
//		//driver.navigate().to("https://www.amazon.in/");
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		Thread.sleep(5000);
//		
//		driver.navigate().refresh();
//		Thread.sleep(5000);
		
	//	for setposition method create object of point class		
//		Point targetPosition=new Point(100,600);
//		driver.manage().window().setPosition(targetPosition);
		
//		Dimension targetsize= new Dimension(500,200);
//		driver.manage().window().setSize(targetsize);
	
		
		
		
	}

}
