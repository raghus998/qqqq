package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
	@FindBy(xpath = "//a[@class='nextMonth ']")
	private WebElement nxtM;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnnM() 
	{
		nxtM.click();
		
	}

}
