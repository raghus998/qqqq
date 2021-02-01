package popup;

import java.io.NotSerializableException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/home");
		driver.findElement(By.xpath("//a[@id='loginText']//following::span[.='AGENT LOGIN'][1]")).click();
		driver.findElement(By.id("loginbutton")).click();
		try 
		{
			Alert a = driver.switchTo().alert();
			String atext = a.getText();
			String etext = "Enter User ID";
			System.out.println("Actual message :"+atext);
			System.out.println("Expected message ;"+etext);
			if (atext.equals(etext)) 
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			a.accept();
		} 
		catch (NoAlertPresentException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
