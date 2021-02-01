package popup1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CB
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		Set<String> aw = driver.getWindowHandles();
		System.out.println(aw.size());
		for (String string : aw)
		{
			System.out.println(string);
		}
		for (String string : aw) 
		{
			driver.switchTo().window(string);
			driver.close();
			
		}
	}

}
