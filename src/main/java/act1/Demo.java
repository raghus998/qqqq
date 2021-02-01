package act1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	static
	{
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://home.redbrickhealth.com/");
		WebElement about = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='About Us']"));
		Actions act = new Actions(driver);
		act.moveToElement(about).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Company')]")).click();
		driver.close();
	}
}