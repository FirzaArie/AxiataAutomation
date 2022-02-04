package com.gistgithub.locator.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main {

		public static void main(String[] args) {
			DriverSingleton driverSingleton = DriverSingleton.getInstance();
			WebDriver driver = DriverSingleton.getDriver();
			driver.get("https://www.phptravels.net/login");
			WebElement email = driver.findElement(By.cssSelector("input[placeholder='Email']"));
			email.sendKeys("user@phptravels.com");
			WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
			password.sendKeys("demouser");		
			WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
			login.submit();
		}
}
