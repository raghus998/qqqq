package act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	static {
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://home.redbrickhealth.com/");
		WebElement solutions = driver.findElement(By.xpath("//a[.='RedBrick Health']//following::a[.='Solutions'][1]"));
		Actions act = new Actions(driver);
		act.moveToElement(solutions).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Problems We Solve')]")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
/*
 * public static void main(String[] args) {
 * WebDriverManager.chromedriver().version("2.36").setup(); WebDriver driver =
 * new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("https://github.com/bonigarcia/webdrivermanager"); driver.close();
 * 
 * }
 * 
 * } /*WebDriverManager.chromedriver().setup();
 * WebDriverManager.firefoxdriver().setup();
 * WebDriverManager.operadriver().setup(); WebDriverManager.phantomjs().setup();
 * WebDriverManager.edgedriver().setup(); WebDriverManager.iedriver().setup();
 */