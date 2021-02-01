package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FES
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/RS/HTML_Files/Months.html");
		List<WebElement> options = driver.findElements(By.xpath("//option"));
		int count = options.size();
		System.out.println("Total no of Elements are :"+count);
		System.out.println("The value are :");
		for (WebElement option : options)
		{
			String text = option.getText();
			System.out.println(text);
		}
		driver.close();
	}
}
