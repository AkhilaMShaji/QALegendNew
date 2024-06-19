package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagement {

	WebDriver driver;

	public UserManagement(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//i[@class='fa fa-user']//following-sibling::span")
	WebElement users;
	@FindBy(xpath = "//i[@class='fa fa-briefcase']//following-sibling::span")
	WebElement roles;
	@FindBy(xpath = "//i[@class='fa fa-handshake-o']//following-sibling::span")
	WebElement agents;
	public boolean usersOptionInUserManagement() {


		boolean usersOption = users.isDisplayed();
		return usersOption;
	}

	public boolean rolesOptionInUserManagement() {


		boolean rolesOption = roles.isDisplayed();
		return rolesOption;

	}
	public boolean agentsOptionInUserManagement() {

		boolean agentsOption = agents.isDisplayed();
		return agentsOption;

	}
}
