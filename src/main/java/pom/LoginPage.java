package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Declaration
	@FindBy(id = "username")
	private WebElement UNTB;
	
	@FindBy(name = "pwd")
	private WebElement PWTB;
	
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	private WebElement LoginBtn;
	
	
	//Inisalazation
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public void enterUserName(String un)
	{
		UNTB.sendKeys(un);
	}
	
	public void enterPassword(String pw) 
	{
		PWTB.sendKeys(pw);	
	}
	
	public void clickOnLogin() 
	{
		LoginBtn.click();
	}
}
