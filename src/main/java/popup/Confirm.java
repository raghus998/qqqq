package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Confirm
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.stqatools.com/Alerts.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='jcalert']")).click();
		Thread.sleep(3000);
		try 
		{
			Alert a = driver.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
			
		} 
		catch (NoAlertPresentException e)
		{
			
		}
}
}