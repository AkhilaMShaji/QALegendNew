package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByValue(WebElement element,String value) {
		Select select =new Select(element);
		select.selectByValue(value);
		
	}
	
	public void selectByVisibleText(WebElement element,String visibleText) {
		Select select =new Select(element);
		select.selectByVisibleText(visibleText);
		
	}
	public void selectDropDownByIndexValue(WebElement element ,int value){
		Select select = new Select(element);
		select.selectByIndex(value);	
	}
	public void clickAndHoldOnElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).build().perform();
	}
	public void contextClick(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}
	public void moveToElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	public void doubleClick(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}
	
	public String toGetAttributeValue(WebElement element,String attribute)
	{
		String attributeValue=element.getAttribute(attribute);
		return attributeValue;
	}

	public void selectSingleDropdownValue(WebElement dropDown,String dropDownvalue)
	{
		Select selectsingledropdown=new Select(dropDown);
		selectsingledropdown.selectByValue(dropDownvalue);
	}
    
	public void selectDropdownValue(WebElement dropDown,String dropDownvalue)
	{
		Select selectsingledropdowntext=new Select(dropDown);
		selectsingledropdowntext.selectByVisibleText(dropDownvalue);
	}
	public void selectDropdownByUsingIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}

	

}
