package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1
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
		driver.findElement(By.id("p")).sendKeys(Keys.ENTER);
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = a.getText();
		System.out.println(text);
	
		//a.accept();
		a.dismiss();

}
}