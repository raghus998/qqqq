package fr;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Raghu/Workspace/HTML/Frames/page1.html");
		driver.findElement(By.id("fn")).sendKeys("Ragha");
		//driver.switchTo().frame(0);
		driver.switchTo().frame("frm1");
		driver.findElement(By.id("mn")).sendKeys("vendra");
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).sendKeys("18+");
		driver.findElement(By.id("g")).sendKeys("M");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("j")).sendKeys("IPS");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("ln")).sendKeys("Sangoji");

}
}