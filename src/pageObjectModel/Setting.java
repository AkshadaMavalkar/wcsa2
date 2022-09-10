package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Setting {
	//declaration
	@FindBy(partialLinkText="Settings")private WebElement Settings;
	@FindBy(xpath="//a[contains(text(),' & Color ')]")private WebElement  Logoscheme;
	@FindBy(name="colorScheme")private WebElement colorscheme;
	@FindBy(xpath="//select/ option[.='Red']")private WebElement Redscheme;
	@FindBy(xpath="//input[@type='submit']")private WebElement Savesetting;
	
	//initialization
			public Setting(WebDriver driver) 
			{
				PageFactory.initElements(driver,this);
			
			}
			
	//utilization

		
			public WebElement getSettings() {
				return Settings;
			}

			public WebElement getLogoscheme() {
				return Logoscheme;
			}

			public WebElement getColorscheme() {
				return colorscheme;
			}

			public WebElement getRedscheme() {
				return Redscheme;
			}
			

			public WebElement getSavesetting() {
				return Savesetting;
			}
			
			//operational method
			public void Setting()
			{
				Settings.click();
				Logoscheme.click();
			    colorscheme.click();
			    Redscheme.click();
			    Savesetting.click();
			}
}
