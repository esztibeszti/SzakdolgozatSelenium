package SzakdolgozatPackage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AtlassianLogin extends BasePage {
	@FindBy(id = "username")
	private WebElement userNameInput;

	@FindBy(id = "login-submit")
	private WebElement submitButton;

	@FindBy(id = "password")
	private WebElement passwordInput;
	
	private final String atlassianLoginURL = "https://szakdolgozatkecskesdeszter.atlassian.net/jira";

	public void loginAtlassian(String username, String password) throws InterruptedException {
		driver.navigate().to(atlassianLoginURL);
		driverWait.until(ExpectedConditions.elementToBeClickable(submitButton)); // ez van lent a DOM-ban
		userNameInput.sendKeys(username); // beirja az email cimet
		submitButton.click(); // megnyomja a continue gombot
		driverWait.until(ExpectedConditions.elementToBeClickable(passwordInput));
		passwordInput.sendKeys(password);
		submitButton.click();
	}

}
