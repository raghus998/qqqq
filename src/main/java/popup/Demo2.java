package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Homepage hp = new Homepage(driver);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//strong[.='Depart on']/following::i[@class='icon ir datePicker'][1]")).click();
		/*WebElement nxtBtn = driver.findElement(By.xpath("//a[@class='nextMonth ']"));
		for (int i = 0; i < 5; i++)
		{
			nxtBtn.click();
		}*/
		
		for (int i = 0; i <5; i++) 
		{
			hp.clickOnnM();
			Thread.sleep(1000);
		}
		driver.findElement(By.xpath("//span[.='December']/following::a[.='18']")).click();
}
}