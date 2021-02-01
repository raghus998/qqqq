package com.s;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo10 {
	static int count = 0;
	static {
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) {
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
			if(text.equals("Idly"))
			{
				count++;
			}
		}
		if (count > 1) 
		{
			System.out.println("The element is duplicate");
			
		} 
		else
		{
			System.out.println("The element is not  duplicate");
		}
		driver.close();
	}
}
