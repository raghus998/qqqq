package fr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Raghu/Workspace/HTML/Frames/page1.html");
		driver.findElement(By.id("fn")).sendKeys("Raghavendra");
		driver.switchTo().frame("frm1");
		driver.findElement(By.id("mn")).sendKeys("No Name");
		Thread.sleep(5000);
		driver.findElement(By.id("j")).sendKeys("IPS");
		Thread.sleep(5000);
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("a")).sendKeys("27");
		driver.findElement(By.id("g")).sendKeys("M");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("Sangoji");
	}

}
