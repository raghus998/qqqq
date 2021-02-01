package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WDW {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		WebDriverWait  w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		w.until(ExpectedConditions.titleIs("actiTIME - Login"));
		driver.close(); 
	}
}
