package com.s;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo9
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
		List<WebElement> alloption = sel.getOptions();
		ArrayList<String> allText = new ArrayList<String>();
		for (WebElement option : alloption)
		{
			String text = option.getText();
			allText.add(text);
		}
		if(allText.contains("Idlya"))
		{
			System.out.println("Element is present");
		}
		else 
		{
			System.out.println("Element is not  present");
		}
		driver.close();
}	
}