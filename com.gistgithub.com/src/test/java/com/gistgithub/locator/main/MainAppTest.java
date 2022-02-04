package com.gistgithub.locator.main;

import org.testng.annotations.Test;

import com.gistgithub.locator.driver.DriverSingleton;
import com.gistgithub.locator.pages.dashboard.Logout;
import com.gistgithub.locator.pages.git.Git;
import com.gistgithub.locator.pages.login.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class MainAppTest {
  @BeforeMethod
  public void beforeMethod() {
	DriverSingleton.getInstance();
	WebDriver driver = DriverSingleton.getDriver();
	driver.get("https://gist.github.com/discover");
  }

  @AfterMethod
  public void afterMethod() {
  }


  @Test
  public void a_method() {
	LoginPage login = new LoginPage();
	login.gotoLogin();
	login.login();
  }
  
  @Test
  public void b_method() {
	  Git git = new Git();
		git.Create();
		git.Edit();
		git.Delete();
		git.List();
  }
  
  @Test
  public void c_method() {
	Logout logOut = new Logout();
	logOut.logout();
  }
  
  
}
