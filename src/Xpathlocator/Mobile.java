package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobile {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();//to maximize the window
	    
	    driver.get("https://www.flipkart.com");//to open flipkart
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//button[.='✕']")).click();//to close login window of flipkart
	    Thread.sleep(5000);
	    
	    driver.findElement(By.name("q")).sendKeys("samsung galaxyf12");//for search bar
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//for search icon of search bar
	    Thread.sleep(3000);
	    
	    String galaxyf12=driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	    
	   System.out.println(galaxyf12);
	   
	}

}
