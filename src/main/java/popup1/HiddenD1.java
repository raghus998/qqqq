package popup1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenD1 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		Date date = new Date();
		
		SimpleDateFormat s1 = new SimpleDateFormat("d");
		String day = s1.format(date);
		
		SimpleDateFormat s2 = new SimpleDateFormat("MMMM");
		String month = s2.format(date);
		
		driver.findElement(By.xpath("//span[.='"+month+"']/../../..//a[.='"+day+"']")).click();
		

}
}