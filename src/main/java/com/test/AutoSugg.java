package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(3000);
		List<WebElement> AutoSugg = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		int count = AutoSugg.size();
		System.out.println("No of AutoSugg are :" + count);
		System.out.println("The auto sugg are :");
		for (int i = 0; i <count; i++)
		{
			WebElement ele = AutoSugg.get(i);
			String text = ele.getText();
			System.out.println(text);
			if(text.equals("qspiders banaswadi"))
			{
				ele.click();
			}	
		}
	}
}
