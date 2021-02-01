package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FES1 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/RS/HTML_Files/MultipleAB.html");
		List<WebElement> cbs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = cbs.size();
		System.out.println("Total no of checkbox's are :"+count);
		for (WebElement cb : cbs)
		{
			cb.click();
		}
		Thread.sleep(5000);
		driver.close();
	}
}
