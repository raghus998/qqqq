package com.s1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {
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
		if (sel.isMultiple())
		{
			System.out.println("Multi Select");	
		}
		else
		{
			System.out.println("Single Select");	
		}
		List<WebElement> allOptions = sel.getOptions();
		int count = allOptions.size();
		System.out.println("The total no of option selected are :" + count);
		System.out.println("The optiobn are :");
		/*
		 * for (int i = 0; i < count; i++)
		 *  { 
		 *  WebElement option = allOptions.get(i);
		 * String text = option.getText();
		 *  System.out.println(text); 
		 *  }
		 */
		for (WebElement option : allOptions) 
		{
			String text = option.getText();
			System.out.println(text);
		}
		driver.close();
	}
}