package act1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Com 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ac = driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]"));
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).click(ac).perform();
		//act.sendKeys(Keys.SHIFT).click(ac).perform();	
	
		

}
}