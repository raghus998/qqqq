package popup1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenD2 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		Date date = new Date();
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
	
		
		LocalDate plusd = today.plusDays(1);
		String stg = plusd.toString();
		String[] splitD = stg.split("-");
		System.out.println(splitD[2]);
		
		LocalDate plusm = today.plusMonths(1);
		String stg1 = plusm.toString();
		String[] splitM = stg1.split("-");
		System.out.println(splitM[1]);
		
		
		driver.findElement(By.xpath("//span[.='July']/../../..//a[.='"+splitD[2]+"']")).click();
		
}
}