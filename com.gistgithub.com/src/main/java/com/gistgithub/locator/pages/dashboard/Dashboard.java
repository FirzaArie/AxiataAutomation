package com.gistgithub.locator.pages.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gistgithub.locator.driver.DriverSingleton;



public class Dashboard {

	private WebDriver driver;
	
	public Dashboard() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "#user-links > details > summary > span")
	private WebElement btnProfil;
	
	@FindBy(css = "#user-links > details > details-menu > form > button")
	private WebElement btnLogout;
	
	@FindBy(css = "#js-pjax-container > div > form > input.btn.btn-block.f4.py-3.mt-5")
	private WebElement btnLogoutIya;
	
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(btnProfil));
		btnProfil.click();
		btnLogout.click();
		btnLogoutIya.click();
		}
	}


