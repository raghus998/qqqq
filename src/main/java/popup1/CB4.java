package popup1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CB4 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		Set<String> aw = driver.getWindowHandles();
		for (String string : aw) 
		{
			driver.switchTo().window(string);
			String title = driver.getTitle();
			if(title.equals("actiTIME - Time Tracking & Scope Management Software"))
			{
				break;
			}
			
		}
		

}
}