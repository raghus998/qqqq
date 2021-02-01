package com.s;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo6
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Raghu/Workspace/HTML/ListBoxM.html");
		WebElement hotel = driver.findElement(By.id("slv"));
		Select sel = new Select(hotel);
		List<WebElement> allOptions = sel.getOptions();
		HashSet<String> allText = new HashSet<String>();
		for (WebElement option : allOptions)
		{
			String text = option.getText();
			allText.add(text);
		}
		for (String string : allText)
		{
			System.out.println(string);	
		}
		driver.close();
	}
}
