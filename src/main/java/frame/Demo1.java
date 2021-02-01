package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Raghu/Workspace/HTML/Frames/page11.html");
		driver.findElement(By.id("fn")).sendKeys("Raghavendra");
		driver.switchTo().frame(driver.findElement(By.id("frm")));
		driver.findElement(By.id("mn")).sendKeys("N");
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).sendKeys("28");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("j")).sendKeys("IPS");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("ln")).sendKeys("Sangoji");
	
		
		
		
	}

}
