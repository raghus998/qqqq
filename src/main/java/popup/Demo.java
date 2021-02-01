package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Raghu/Workspace/HTML/popup1.html");
		driver.findElement(By.id("c")).sendKeys(Keys.ENTER);
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		Thread.sleep(2000);
		a.accept();
		//a.dismiss();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
