package act1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cont
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		Thread.sleep(3000);
		Robot r = new Robot();
		/*r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);*/
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		

}
}