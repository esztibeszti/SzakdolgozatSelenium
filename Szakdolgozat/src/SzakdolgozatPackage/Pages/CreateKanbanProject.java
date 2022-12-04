package SzakdolgozatPackage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateKanbanProject extends BasePage {
	@FindBy(xpath = "//button[@aria-label='Kanban']")
	private WebElement kanbanCreateButton;
	
	@FindBy(xpath = "//button//span[text()='Use template']")
	private WebElement useTemplateButton;
	
	@FindBy(xpath = "//button//span[text()='Select a company-managed project']")
	private WebElement companyManagedSelect;
	
	@FindBy(xpath = "//button//span[text()='Select a team-managed project']")
	private WebElement teamManagedSelect;
	
	@FindBy (id = "project-create.create-form.name-field.input")
	private WebElement projectNameInput;
	
	@FindBy(xpath = "//button[@class='css-ryxqcb']//span[text()='Create project']")
	private WebElement finalCreateProjectButton;
	
	public void createScrumProject (String projectname) {
		driverWait.until(ExpectedConditions.elementToBeClickable(kanbanCreateButton));
		kanbanCreateButton.click();
		driverWait.until(ExpectedConditions.elementToBeClickable(useTemplateButton));
		useTemplateButton.click();
		driverWait.until(ExpectedConditions.elementToBeClickable(teamManagedSelect));
		teamManagedSelect.click();
		driverWait.until(ExpectedConditions.elementToBeClickable(projectNameInput));
		projectNameInput.sendKeys(projectname);
		driverWait.until(ExpectedConditions.elementToBeClickable(finalCreateProjectButton));
		finalCreateProjectButton.click();
	}
	
}
