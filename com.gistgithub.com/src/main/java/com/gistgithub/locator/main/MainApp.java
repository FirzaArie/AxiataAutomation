package com.gistgithub.locator.main;

import org.openqa.selenium.WebDriver;

import com.gistgithub.locator.driver.DriverSingleton;
import com.gistgithub.locator.pages.dashboard.Dashboard;
import com.gistgithub.locator.pages.git.Git;
import com.gistgithub.locator.pages.login.LoginPage;

public class MainApp {

	public static void main(String[] args) {

		DriverSingleton.getInstance();
		WebDriver driver = DriverSingleton.getDriver();
		driver.get("https://gist.github.com/discover");
		
		LoginPage login = new LoginPage();
		login.gotoLogin();
		/*
		 * Email : FirzaArie
		 * Password : Arieperdana19
		 */
		login.login("FirzaArie", "Arieperdana19");
		
		driver.get("https://gist.github.com");
		
		Git git = new Git();
		git.Create();
		git.Edit();
		git.Delete();
		git.List();
		
		Dashboard dashboard = new Dashboard();
		dashboard.logout();
				
		
	}
}
