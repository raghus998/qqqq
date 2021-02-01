package popup1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html 
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
		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnConfirm")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ezok-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnPrompt")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("prompt")).sendKeys("Raghavendra Sangoji IPS");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Ok']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.cssSelector("#ezAlerts-message")).getText();
		System.out.println("The entered text is : "+text);
		driver.close();

}
}