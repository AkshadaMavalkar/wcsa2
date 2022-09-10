//Remove duplicate from the list using linklist,array,treeset
package Homework;
import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import javax.swing.Spring;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicate {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Akshada%20Mavalkar/Desktop/Html%20Document/multiselectdropdown.html");

		WebElement menu=driver.findElement(By.id("menu"));
		
		Select order=new Select(menu);
		
		//Declaring the hashset
		HashSet<String> H1=new HashSet<String>();	
		for(int i=0;i<15;i++)
		{
			order.selectByIndex(i);
		}
		List<WebElement> Selected = order.getAllSelectedOptions();
		
		for(int i=0;i<15;i++)
		{
			WebElement order1=Selected.get(i);
			String Order_text=order1.getText();
			H1.add(Order_text);												//adding element to set
			//System.out.println(Order_text);
		}
		//iterator isused to get the all element from the set
		
		java.util.Iterator<String> itr=H1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
		
}	
		



