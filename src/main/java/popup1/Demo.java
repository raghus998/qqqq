package popup1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo 
{
	static
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.iedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.stqatools.com/Alerts.php");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#jbalert")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a.getText());
		a.accept();
	}
}
