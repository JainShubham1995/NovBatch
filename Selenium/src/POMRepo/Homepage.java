package POMRepo;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	private WebDriver driver;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(id = "lohoutLink")
	private WebElement logOutButton;

	public WebElement getLogOutButton() {    
		return logOutButton;
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	public void logoutAction() {
		logOutButton.click();
	}
}
