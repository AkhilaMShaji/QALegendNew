package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import constants.Messages;
import page.HomePage;
import page.LoginPage;
import utilities.ExcelUtility;

public class HomePageTest extends Base{
	@Test(groups= {"Regression"})
	
	 public void getPageTitle() 
	{
	    String username = ExcelUtility.readStringData(0, 1,Constants.HOME_PAGE);
	    String password = ExcelUtility.readIntegerData(0, 2, Constants.HOME_PAGE);
	    String expected_title = ExcelUtility.readStringData(1, 0,Constants.HOME_PAGE);
	    
	    LoginPage login = new LoginPage(driver);
	    login.enterUserName(username);
	    login.enterPassword(password);
	    HomePage home =  login.clickOnLoginButton();
	   String actual_title = home.getActualTitle();
	    System.out.println("The title of the page is " +actual_title);
		Assert.assertEquals(actual_title, expected_title,Messages.HOME_TITEMISMATCH);
	}
  
	@Test(groups = "Sanity")

	public void verifyUserLoginDateMatchesSystemDate() {
	    String username = ExcelUtility.readStringData(0, 1,Constants.HOME_PAGE);
		String password = ExcelUtility.readIntegerData(0, 2, Constants.HOME_PAGE);
		LoginPage login=new LoginPage(driver);
		login.enterUserName(username);
		login.enterPassword(password);
		HomePage home=login.clickOnLoginButton();
		String date=home.homepageDate();
		System.out.println("Date Text" + date );
		String system_date = home.getSystemDate();
        System.out.println("The system date is " +system_date);
        Assert.assertEquals(date, system_date,Messages.HOME_DATEMISMATCH);
		
		
	}
	

}
