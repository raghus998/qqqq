package popup1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 
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
		driver.get("file:///D:/Raghu/Workspace/HTML/popup1.html");
		Thread.sleep(5000);
		driver.findElement(By.id("p")).click();

		Alert a = driver.switchTo().alert();
		a.sendKeys("RS");
		Thread.sleep(3000);
		a.accept();
		driver.close();
		

}
}