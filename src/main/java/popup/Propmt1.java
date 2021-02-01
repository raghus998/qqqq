package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Propmt1
{
	static
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.iedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new InternetExplorerDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.stqatools.com/Alerts.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='jpalert']")).click();
		Thread.sleep(3000);
		try 
		{
			Alert a = driver.switchTo().alert();
			System.out.println(a.getText());
			Thread.sleep(3000);
			a.sendKeys("RS");
			Thread.sleep(3000);
			a.accept();
		} 
		catch (NoAlertPresentException e)
		{
			System.out.println(e.getMessage());
		}

}
}