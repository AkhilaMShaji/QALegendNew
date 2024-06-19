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
	WebElement users_option;
	@FindBy(xpath = "//i[@class='fa fa-briefcase']//following-sibling::span")
	WebElement roles_option;
	@FindBy(xpath = "//i[@class='fa fa-handshake-o']//following-sibling::span")
	WebElement agents_option;
	public boolean checkUsersOptionAvailability() {

		boolean usersOption = users_option.isDisplayed();
		return usersOption;
	}

	public boolean checkRolesOptionAvailability() {

		boolean rolesOption = roles_option.isDisplayed();
		return rolesOption;

	}
	public boolean checkAgentsOptionAvailability() {

		boolean agentsOption = agents_option.isDisplayed();
		return agentsOption;

	}
}
