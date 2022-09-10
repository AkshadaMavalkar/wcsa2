package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();//to maximize the window
	   
	   
	    driver.get("https://www.calculator.net/");//to open calculator
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//span[@onclick='r(1)' and .='1']")).click(); //1st number
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click(); //2nd number
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click(); //3rd number
	    Thread.sleep(5000);

	    driver.findElement(By.xpath("//span[@class='sciop' and .='+']")).click(); //+ operator
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//span[@onclick='r(2)' and .='2']")).click(); //1st number
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click(); //2nd number
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();//3rd number
	    Thread.sleep(5000);
	    
	    //// go to calculator site and do addition manually and inspect result i.e and copy xpath 300
	    String result = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText(); 
	    System.out.println(result);
	
	}

}
