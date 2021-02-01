package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.Chrome;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Raghu/Workspace/HTML/Frames/page22.html");
		driver.findElement(By.id("mn")).sendKeys("RS");
		driver.switchTo().frame("frame");
		driver.findElement(By.id("a")).sendKeys("88");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("j")).sendKeys("IPS");
	}

}
