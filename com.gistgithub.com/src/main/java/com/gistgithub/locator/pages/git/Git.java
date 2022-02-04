package com.gistgithub.locator.pages.git;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gistgithub.locator.driver.DriverSingleton;




public class Git {
	private WebDriver driver;
	
	public Git() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "code-editor")
	private WebElement boxCodeEditor;
	
	@FindBy(css = "#new_gist > div > div.d-flex.flex-items-center.flex-justify-between > div > button")
	private WebElement createGist;
	
	@FindBy(css = "body > div.position-relative.js-header-wrapper > div > div.Header-item.Header-item--full.js-site-search.flex-column.flex-md-row.width-full.flex-order-2.flex-md-order-none.mr-0.mr-md-3.mt-3.mt-md-0.Details-content--hidden-not-important.d-md-flex > nav > a:nth-child(1)")
	private WebElement listGist;
	
	@FindBy(css = "#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > ul > li:nth-child(1) > a")
	private WebElement editGist;
	
	@FindBy(xpath = "/html/body/div[6]/div/main/div[2]/div/form[1]/div/div[2]/button")
	private WebElement updateGist;
	
	@FindBy(css = "#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > ul > li:nth-child(2) > form > button")
	private WebElement deleteGist;
	
	public void Create() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(createGist));
		boxCodeEditor.sendKeys("Hello World");
		createGist.click();
	}
	
	public void Edit() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(editGist));
		editGist.click();
		boxCodeEditor.sendKeys(" Hello Again ");
		updateGist.click();
	}
	
	public void Delete() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(deleteGist));
		deleteGist.click();
		driver.switchTo().alert().accept();
	}
	
	public void List() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(listGist));
		listGist.click();
	}
	
	
	
}
