package com.gistgithub.locator.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gistgithub.locator.driver.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "login_field")
	private WebElement txtUsername;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(css = "#login > div.auth-form-body.mt-3 > form > div > input.btn.btn-primary.btn-block.js-sign-in-button")
	private WebElement btnLogin;
	
	@FindBy(css = "body > div.position-relative.js-header-wrapper > div > div.Header-item.f4.mr-0 > a.HeaderMenu-link.no-underline.mr-3")
	private WebElement goLoginButton;
	
	public void gotoLogin() {
		goLoginButton.click();
	}
	
	public void login() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		txtUsername.sendKeys("FirzaArie");
		txtPassword.sendKeys("Arieperdana19");
		btnLogin.click();
		
	}
}
