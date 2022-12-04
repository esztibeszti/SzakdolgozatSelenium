package SzakdolgozatPackage.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProjectsTrash extends JiraCloudBasePage {
	private final String deleteProjectURL = "https://szakdolgozatkecskesdeszter.atlassian.net/jira/settings/projects/manage";
	
	@FindBy(xpath = "//button//span[@aria-label='More']")
	private WebElement moreButton;
	
	@FindBy(xpath = "//button//span[text()='Move to trash']")
	private WebElement moveToTrashButton;
	
	@FindBy(xpath = "//button//span[text()='Move']")
	private WebElement moveButton;
	
	private final String trashProjectURL = "https://szakdolgozatkecskesdeszter.atlassian.net/jira/settings/projects/trash";
	
	@FindBy(xpath = "//span[text()='Delete permanently']")
	private WebElement deleteForeverSelect;
	
	@FindBy(xpath = "//button//span[text()='Delete']")
	private WebElement confirmDeleteButton;
	
	
	public void deleteProject(String projectname) {
		driver.navigate().to(deleteProjectURL);
		driverWait.until(ExpectedConditions.elementToBeClickable(moreButton));
		driver.findElement(By.xpath(String.format("//span[text()='%s']/../../../..//button//span[@aria-label='More']",projectname))).click();
		
		driverWait.until(ExpectedConditions.elementToBeClickable(moveToTrashButton));
		moveToTrashButton.click();
		driverWait.until(ExpectedConditions.elementToBeClickable(moveButton));
		moveButton.click();
		driver.navigate().to(trashProjectURL);
		driverWait.until(ExpectedConditions.elementToBeClickable(moreButton));
		driver.findElement(By.xpath(String.format("//span[text()='%s']/../../../..//button//span[@aria-label='More']",projectname))).click();
		driverWait.until(ExpectedConditions.elementToBeClickable(deleteForeverSelect));
		deleteForeverSelect.click();
		driverWait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton));
		confirmDeleteButton.click();
	}
	

}
