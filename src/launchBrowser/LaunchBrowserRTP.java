package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//Took the user input
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name ,chrome or Firefox");
		String browserValue=sc.nextLine();
		
		//BrowserValue variable contains the name of the browser which is supposed to be open
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 driver=new ChromeDriver();//open chrome browser
			 driver.manage().window().maximize();
			 driver.get("https://www.google.com");//launch the web application
			 Thread.sleep(5000);
		}
		
		else if (browserValue.equalsIgnoreCase("Firefox"))
		{
			 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 driver=new FirefoxDriver();//open firefox browser
			 driver.manage().window().maximize();
			 driver.get("https://www.google.com");//launch the web application
			 Thread.sleep(5000);
			
		}
		else
		{
			System.out.println("type valid input");
		}
		
		
	}

}
