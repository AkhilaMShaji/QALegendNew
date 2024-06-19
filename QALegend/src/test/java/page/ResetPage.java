package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPage {
	
		WebDriver driver;
		public ResetPage(WebDriver driver) 
		{
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
		}
		
	
		    @FindBy(xpath = "//a[@class='btn btn-link']")
		    WebElement forgot_password;
		    @FindBy(xpath = "//input[@id='email']")
			WebElement email_field ;
			@FindBy(xpath = "//button[@type='submit']")
			WebElement passwordreset_button ;
			@FindBy(xpath = "//span[@class='help-block']")
			WebElement passwordresetfailure_text ;
		  
		  public ResetPage forgotPasswordelement() 
		  {
			forgot_password.click();
			return new ResetPage(driver);
			  
		  }
		  public void getEmailidField(String emailid) 
			{
				email_field.sendKeys(emailid);
			}
		  public void clickpasswordreset_button() 
			{
				passwordreset_button.click();
			}
		  public String getTextmsgOfResetmailfail() 
			{
				String actual_text = passwordresetfailure_text.getText();
				return actual_text;
			}
	}