package popup1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTime
{
	static
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.iedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[@class='item importTasks']")).click();
		WebElement fu = driver.findElement(By.id("dropzoneClickableArea"));
		fu.click();
		fu.sendKeys("C:\\\\Users\\Raghavendras\\Downloads\\Sample.csv");
		Robot R = new Robot();
	
		R.keyPress(KeyEvent.VK_O);
		R.keyRelease(KeyEvent.VK_O);

}
}