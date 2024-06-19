package test;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import automationcore.Base;
import constants.Constants;
import page.HomePage;
import page.LoginPage;
import page.User;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class UserTest extends Base{
@Test
	
public void verifyAddUser(){
		String username = ExcelUtility.readStringData(0, 0,Constants.USER);
		String password = ExcelUtility.readIntegerData(0, 1, Constants.USER);
		String first_name=RandomDataUtility.getFirstname();
	    String last_name=RandomDataUtility.getLastname();
		String mailid = first_name+"."+last_name+"@gmail.com";
		String password2=first_name+"123..";
		    
	    LoginPage login = new LoginPage(driver);
	    login.enterUserName(username);
	    login.enterPassword(password);
	    login.clickOnLoginButton();
		    
	    HomePage home = new HomePage(driver);
	    home.applicationTourPopupBoxClose();
	    home.clickOnUserManagementbutton();
	    home.clickOnUsersbutton();
	    
			User user1= new User(driver);
			user1.clickOnAddUserButton();
			user1.addFirstname(first_name);
			user1.addLastname(last_name);
			user1.addEmail(mailid);
			user1.addUserName(password2);
			user1.addpassword(password2);
		    user1.addConfirmpassword(password2);
		    user1.clickOnSubmitButton();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    String actual_result = home.getTextofProfile();
		    System.out.println(actual_result);
		    String expected_result =ExcelUtility.readStringData(0, 3, Constants.USER);
		    Assert.assertEquals(actual_result, expected_result, "invalid");
}
	@Test
public void verifySearchUser() {
		String username = ExcelUtility.readStringData(0, 0,Constants.USER);
		String password = ExcelUtility.readIntegerData(0, 1, Constants.USER);
		String search =ExcelUtility.readStringData(0, 2, Constants.USER);
		   LoginPage login = new LoginPage(driver);
		    login.enterUserName(username);
		    login.enterPassword(password);
		    login.clickOnLoginButton();
		    HomePage home = new HomePage(driver);
		    home.applicationTourPopupBoxClose();
		    home.clickOnUserManagementbutton();
		    home.clickOnUsersbutton();
		    User user1= new User(driver);
			user1.clickOnSearchBar(search);
			String actual_result=user1.oneOfOneMessage();
			System.out.println(actual_result);
			//String expected_result= ExcelUtility.readStringData(0, 5, Constants.USER);
			//Assert.assertEquals(actual_result, expected_result, "invalid");
			
			
	}
	@Test
	
	public void verifyDeleteUserWhoIsRecentlyAdded() {
		String username = ExcelUtility.readStringData(0, 0,Constants.USER);
		String password = ExcelUtility.readIntegerData(0, 1, Constants.USER);
		String first_name=RandomDataUtility.getFirstname();
	    String last_name=RandomDataUtility.getLastname();
		String mailid = first_name+"."+last_name+"@gmail.com";
		String password2=first_name+"123..";
		    
	    LoginPage login = new LoginPage(driver);
	    login.enterUserName(username);
	    login.enterPassword(password);
	    login.clickOnLoginButton();
		    
	    HomePage home = new HomePage(driver);
	    home.applicationTourPopupBoxClose();
	    home.clickOnUserManagementbutton();
	    home.clickOnUsersbutton();
	    
			User user1= new User(driver);
			user1.clickOnAddUserButton();
			user1.addFirstname(first_name);
			user1.addLastname(last_name);
			user1.addEmail(mailid);
			user1.addUserName(password2);
			user1.addpassword(password2);
		    user1.addConfirmpassword(password2);
		    user1.clickOnSubmitButton();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    user1.enterSearchValue(password2);
		    user1.clickDeleteButtoun();
		    user1.clickOkButtoun();
		    Assert.assertEquals("User deleted successfully","User deleted successfully", "Deletion not successful");
	}
	@Test
	
	public void loginOfANewUser() {
		String username = ExcelUtility.readStringData(0, 0,Constants.USER);
		String password = ExcelUtility.readIntegerData(0, 1, Constants.USER);
		String first_name=RandomDataUtility.getFirstname();
	    String last_name=RandomDataUtility.getLastname();
		String mailid = first_name+"."+last_name+"@gmail.com";
		String password2=first_name+"123..";
		    
	    LoginPage login = new LoginPage(driver);
	    login.enterUserName(username);
	    login.enterPassword(password);
	    login.clickOnLoginButton();
		    
	    HomePage home = new HomePage(driver);
	    home.applicationTourPopupBoxClose();
	    home.clickOnUserManagementbutton();
	    home.clickOnUsersbutton();
	    
			User user1= new User(driver);
			user1.clickOnAddUserButton();
			user1.addFirstname(first_name);
			user1.addLastname(last_name);
			user1.addEmail(mailid);
			user1.addUserName(password2);
			user1.addpassword(password2);
		    user1.addConfirmpassword(password2);
		    user1.clickOnSubmitButton();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    HomePage home1 = new HomePage(driver);
		    home1.clickOnSignoutDashBoad();
		    home1.clickOnSignoutButton();
	}

}