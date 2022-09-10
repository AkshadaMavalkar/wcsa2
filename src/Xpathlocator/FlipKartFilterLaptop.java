package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartFilterLaptop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");//to open flipkart
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//button[.='✕']")).click(); //to close X
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("laptop"); //to search on text bar
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();// for seach icon of search bar 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[.='Core i5' and @class='_3879cV']")).click();// for checkbox of processor 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF' and .='Brand']")).click();//for brand title
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[.='HP' and @class='_3879cV']")).click();// to selcet checkbox of brand
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF' and .='Operating System']")).click();//for operating system title 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Windows 10']")).click();//to select checkbox of os
		Thread.sleep(3000);
		
		String priceOfTheFirstSuggestion = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		System.out.println("price of the first suggestion "+priceOfTheFirstSuggestion);
	
	}

}