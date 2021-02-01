package act1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		//act.dragAndDrop(drag, drop).perform();
		//act.clickAndHold(drag).moveToElement(drop).release().perform();
		act.clickAndHold(drag).moveToElement(drop, 50, 120).release().perform();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.close();

}
}