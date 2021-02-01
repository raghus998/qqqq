package act1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 
{
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
		List<WebElement> links = driver.findElements(By.xpath("//li[@id='menu-item-91']/ul/li"));
		int count = links.size();
		System.out.println(count);
		for (int i = 0; i <count; i++) 
		{
			WebElement link = links.get(i);
			String text = link.getText();
			System.out.println(text);
			//
			if (text.equalsIgnoreCase("Newsroom"))
			{
				links.get(i).click();
				
			}
			
		}

}
}