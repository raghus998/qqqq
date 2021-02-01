package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/6040914/what-is-the-reason-for-a-red-exclamation-mark-next-to-my-project-in-eclipse");
	}
}
