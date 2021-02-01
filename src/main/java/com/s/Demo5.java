package com.s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5 {
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
		ArrayList<String> allText = new ArrayList<String>();
		for (WebElement option  : allOptions) {
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
