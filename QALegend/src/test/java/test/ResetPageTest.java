package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import page.LoginPage;
import page.ResetPage;
import sun.tools.jconsole.Messages;
import utilities.ExcelUtility;

public class ResetPageTest extends Base{
	
	
	@Test
	public void verifyLoginPageWithInvalidEmail() {
		  String emailid = ExcelUtility.readStringData(0, 0,Constants.RESET_PAGE);
		  String expected_text = ExcelUtility.readStringData(1, 0, Constants.RESET_PAGE) ;
		 LoginPage login = new LoginPage(driver);
		 login.forgotPasswordelement();
		    ResetPage reset = new ResetPage(driver);
		    reset.getEmailidField(emailid);
	        reset.clickpasswordreset_button();
	        String actual_text = reset.getTextmsgOfResetmailfail();
	        System.out.println(actual_text);
	       Assert.assertEquals(actual_text, expected_text,Messages.INVALID_PLUGIN_PATH);
	}
}