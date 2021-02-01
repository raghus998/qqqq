package com.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		driver.get("file:///D:/Raghu/Workspace/HTML/ListBoxM.html");
		WebElement hotel = driver.findElement(By.id("slv"));
		Select sel = new Select(hotel);
		sel.selectByIndex(3);
		sel.selectByValue("v");
		sel.selectByVisibleText("Idly");
		Thread.sleep(2000);
		/*sel.deselectByIndex(3);
		sel.deselectByValue("v");
		sel.deselectByVisibleText("Idly");*/
		sel.deselectAll();
		driver.close();
	}

}
