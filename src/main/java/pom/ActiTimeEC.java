package pom;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeEC
{
	private WebElement UNTB;
	private WebElement PWTB;
	private WebElement LoginBtn;
	
	public ActiTimeEC(WebDriver driver) 
	{
		UNTB =driver.findElement(By.id("username"));
		PWTB =driver.findElement(By.name("pwd"));
		LoginBtn =driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
	}
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
