package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
public HomePage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//h1")
WebElement headercontent;
@FindBy(xpath="//section[@class='content-header']")
WebElement welcome_user;

@FindBy(xpath="//div[@class='m-8 pull-left mt-15 hidden-xs']")
WebElement date;
@FindBy(xpath="//span[@class='title']")
WebElement usermanagementfield;
@FindBy(xpath="//span[@class='title']")
WebElement userfield;

@FindBy (xpath = "//button[@class='btn btn-default btn-sm']")
WebElement application_tour ;
@FindBy(xpath = "//span[@class='title' and text()='User Management']")
WebElement usermanagement_button;
@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/users']")
WebElement user_button;

@FindBy(xpath = "//a[@class='dropdown-toggle']")
WebElement signout_dashboard;

@FindBy(xpath = "//a[@class='btn btn-default btn-flat'and@href='https://qalegend.com/billing/public/logout']")
WebElement signout_button;


  public String getLoginUserText() {
	 String text = welcome_user.getText();
	 return text;
  }
public String getActualTitle() {
	String actualtitle=driver.getTitle();
	return actualtitle;
}
public String homepageDate() {
	String datedisplayed= date.getText();
	return datedisplayed;
}
public String getSystemDate() 
{
 String system_date =java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
 return system_date;
}
public void applicationTourPopupBoxClose() 
{
	application_tour.click();
}
public void clickOnUserManagementbutton() 
{
	usermanagement_button.click();
}

public void clickOnUsersbutton() 
{
	user_button.click();
}
public String getTextofProfile() 
{
	String text = welcome_user.getText();
	return text;
}
public void clickOnSignoutDashBoad() 
{
	  signout_dashboard.click();
}
public void clickOnSignoutButton() 
{
	  signout_button.click();
}

}
  