package com.usa.loginfuntiontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upslogingfuntiontest {

	public static void main(String[] args) {
		//open firefox browser 
		
		WebDriver driver = new FirefoxDriver ();
		
		
		//how to send URL
		//driver.get("https://www.ups.com/");
		driver.navigate().to("https://www.ups.com/us/en/Home.page");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
		driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Sarower2017");
		
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Ttech123$");
		
		driver.findElement(By.xpath(".//*[@id='submitBtn']")).click();
		
		//driver.close();
		driver.quit();
		System.out.println("i did good job finish");
	}
	
	
	
} 
