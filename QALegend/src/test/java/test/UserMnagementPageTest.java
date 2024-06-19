package test;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import constants.Messages;
import page.HomePage;
import page.LoginPage;
import page.UserManagement;
import utilities.ExcelUtility;


public class UserMnagementPageTest extends Base {
	@Test
	public void userManagementElementsList() {
		
	
	String username = ExcelUtility.readStringData(0, 0,Constants.USER);
	String password = ExcelUtility.readIntegerData(0, 1, Constants.USER);
	
	   LoginPage login = new LoginPage(driver);
	    login.enterUserName(username);
	    login.enterPassword(password);
	    login.clickOnLoginButton();
	    HomePage home = new HomePage(driver);
	    home.applicationTourPopupBoxClose();
	    home.clickOnUserManagementbutton();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    UserManagement usermanagement= new  UserManagement (driver);
	    usermanagement.rolesOptionInUserManagement();
	    usermanagement.usersOptionInUserManagement();
	    usermanagement.agentsOptionInUserManagement();
	    Assert.assertEquals("elements displayed", "elements displayed", Messages.USERMANAGEMENTELEMENTS_MISMATCH);
	}
}
