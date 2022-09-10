package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchInstagram {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe"); //to avoid illigal statement 
		FirefoxDriver driver = new FirefoxDriver(); //open firefox brower.
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000); //delay of 5 sec
		driver.close(); //close the browser
		
		
	}

}
