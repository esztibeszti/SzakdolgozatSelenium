package SzakdolgozatPackage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JiraCloudBasePage extends BasePage {
	@FindBy(xpath = "//button/span[text()='Projects']")
	protected WebElement projectsMenu;
	
	@FindBy(xpath = "//button//span[text()='Create project']")
	private WebElement createProjectMenu;
	
	public void openProjectsMenu () {
		driverWait.until(ExpectedConditions.elementToBeClickable(projectsMenu));
		projectsMenu.click();
	}
	public void createProjectMenu () {
		driverWait.until(ExpectedConditions.elementToBeClickable(createProjectMenu));
		createProjectMenu.click();
	}
	

}
