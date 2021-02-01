package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest
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
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("danager");
		lp.clickOnLogin();
		
		Thread.sleep(3000);
		
		lp.enterUserName("admin");
		lp.enterPassword("manager");
		lp.clickOnLogin();

}
}