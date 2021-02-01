package com.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5 {
	static {
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.abhibus.com");
		Thread.sleep(3000);
		a.findElement(By.xpath("//div/button[1]")).click();
		a.findElement(By.xpath("//div/div[1]/span/a")).click();
		a.findElement(By.xpath("//input[@id='EmailID']")).sendKeys("RS");

	}
}