package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Arc
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://arc.emids.com/login");
		driver.switchTo().frame(3);
		driver.findElement(By.id("userName")).sendKeys("Raghavendras");
		driver.findElement(By.id("password")).sendKeys("968685rsS3");
		driver.findElement(By.id("submit")).submit();
		

}
}