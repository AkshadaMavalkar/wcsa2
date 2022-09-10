package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefox {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");//to avoid Illigal statement 
		FirefoxDriver driver = new FirefoxDriver();//open firefox brower.
		
		Thread.sleep(5000);//delay of 5 sec
		driver.close();//close the browser
		
		
	}

}
