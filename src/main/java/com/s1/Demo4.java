package com.s1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 
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
		ArrayList<String> allText = new ArrayList<String>();
		List<WebElement> allOptions = sel.getOptions();
		for (WebElement option : allOptions)
		{
			String text = option.getText();
			allText.add(text);
		}
		Collections.sort(allText);
		for (String text : allText)
		{
			System.out.println(text);
		}
		driver.close();
	}
}
