package act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1
{

	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://home.redbrickhealth.com/");
		WebElement solutions = driver.findElement(By.xpath("//a[.='RedBrick Health']//following::a[.='Solutions'][1]"));
		Actions act = new Actions(driver);
		act.moveToElement(solutions).perform();
		

}
}