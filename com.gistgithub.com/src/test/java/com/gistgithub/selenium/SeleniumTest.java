package com.gistgithub.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	@Test
	public final void openBrowser() {	
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		WebElement email = driver.findElement(By.cssSelector("input[placeholder='Email']"));
		email.sendKeys("user@phptravels.com");
		WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		password.sendKeys("demouser");		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		login.submit();

	}

}
