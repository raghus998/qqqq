package act1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/button/#icons");
		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.xpath("//h1[.='Widget']/../button[1]"));
		Actions act = new Actions(driver);
		act.doubleClick(button).release().perform();

}
}