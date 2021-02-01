package popup1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 
{
	static
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.iedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.stqatools.com/Alerts.php");
		driver.findElement(By.cssSelector("#jpalert")).click();
		Thread.sleep(3000);
		try
		{
			Alert a = driver.switchTo().alert();
			a.sendKeys("RS");
			Thread.sleep(2000);
			String t = a.getText();
			System.out.println(t);
			Thread.sleep(3000);
			a.accept();
		} 
		catch (NoAlertPresentException e) 
		{
			System.out.println(e.getMessage());
		}

}
}