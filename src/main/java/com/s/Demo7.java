package com.s;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo7 
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
		TreeSet<String> alltext = new TreeSet<String>();
		for (WebElement option : allOptions) 
		{
			String text = option.getText();
			alltext.add(text);
		}
		for (String string : alltext) 
		{
			System.out.println(string);
		}
		driver.close();
	}
}
