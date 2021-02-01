package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		ActiTimeEC ac = new ActiTimeEC(driver);
		ac.enterUserName("admin");
		ac.enterPassword("danager");
		ac.clickOnLogin();
		Thread.sleep(2000);
		ac.enterUserName("admin");
		ac.enterPassword("manager");
		ac.clickOnLogin();
	}
}
