package SzakdolgozatPackage.Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IssueCreateBulk extends JiraCloudBasePage {
	
	private final String csvUploadURL = "https://szakdolgozatkecskesdeszter.atlassian.net/secure/admin/CsvSetupPage!default.jspa?externalSystem=com.atlassian.jira.plugins.jim-plugin%3AcsvImporter";
	
	@FindBy (id = "csvFile")
	private WebElement csvUploadButton;
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement nextButton;
	
	@FindBy (id = "CSV-select-field")
	private WebElement projectNameInput;
	
	@FindBy (id = "field-780f85493892dc48b674ac9da8974133-mapping-field")
	private WebElement assigneeInput;
	
	@FindBy (id = "manual-mapping-field-780f85493892dc48b674ac9da8974133")
	private WebElement assigneeCheckbox; 
	
	@FindBy (id = "field-0be8406951cdfda82f00f79328cf4efc-mapping-field")
	private WebElement commentInput;
	
	@FindBy (id = "manual-mapping-field-0be8406951cdfda82f00f79328cf4efc")
	private WebElement commentCheckbox;
	
	@FindBy (id = "field-b5a7adde1af5c87d7fd797b6245c2a39-mapping-field")
	private WebElement descriptionInput;
	
	@FindBy (id = "manual-mapping-field-b5a7adde1af5c87d7fd797b6245c2a39")
	private WebElement descriptionCheckbox;

	@FindBy (id = "field-ea8cbcea8e1238d7e78d0f810de1d5d8-mapping-field")
	private WebElement issueTypeInput;
	
	@FindBy (id = "manual-mapping-field-ea8cbcea8e1238d7e78d0f810de1d5d8")
	private WebElement issueTypeCheckbox;
	
	@FindBy (id = "field-502996d9790340c5fd7b86a5b93b1c9f-mapping-field")
	private WebElement prioInput;
	
	@FindBy (id = "manual-mapping-field-502996d9790340c5fd7b86a5b93b1c9f")
	private WebElement prioCheckbox;
	
	@FindBy (id = "field-bd1dc11f8c93f4da5dd624fffb6fc6c0-mapping-field")
	private WebElement reporterInput;
	
	@FindBy (id = "manual-mapping-field-bd1dc11f8c93f4da5dd624fffb6fc6c0")
	private WebElement reporterCheckbox;
	
	@FindBy (id = "field-290612199861c31d1036b185b4e69b75-mapping-field")
	private WebElement summaryInput;
	
	@FindBy (id = "manual-mapping-field-290612199861c31d1036b185b4e69b75")
	private WebElement summaryCheckbox;
	
	@FindBy(xpath = "//button[text()='Begin Import']")
	private WebElement beginImportButton;
	
	@FindBy(xpath = "//div/a[text()='Import another project.']")
	private WebElement validatorToContinue;
	
	
	
	public void issueBulk(String projectname) throws InterruptedException {
		driverWait.until(ExpectedConditions.elementToBeClickable(projectsMenu));
		driver.navigate().to(csvUploadURL);
		driverWait.until(ExpectedConditions.elementToBeClickable(csvUploadButton));
		csvUploadButton.sendKeys("C:\\Users\\Lada\\Desktop\\babie egyetemi dolgai\\test_data.csv");
		driverWait.until(ExpectedConditions.elementToBeClickable(nextButton));
		nextButton.click();
		driverWait.until(ExpectedConditions.elementToBeClickable(projectNameInput));
		projectNameInput.sendKeys(projectname);
		projectNameInput.sendKeys(Keys.ENTER);
		nextButton.click();
		
		assigneeInput.click();
		assigneeInput.clear();
		assigneeInput.sendKeys("Assignee");
		assigneeInput.sendKeys(Keys.ENTER);
		assigneeCheckbox.click();
		
		commentInput.click();
		commentInput.clear();
		commentInput.sendKeys("Comment");
		commentInput.sendKeys(Keys.ENTER);
		commentCheckbox.click();
		
		descriptionInput.click();
		descriptionInput.clear();
		descriptionInput.sendKeys("Description");
		descriptionInput.sendKeys(Keys.ENTER);
		descriptionCheckbox.click();
		
		issueTypeInput.click();
		issueTypeInput.clear();
		issueTypeInput.sendKeys("Issue Type");
		issueTypeInput.sendKeys(Keys.ENTER);
		issueTypeCheckbox.click();
		
		prioInput.click();
		prioInput.clear();
		prioInput.sendKeys("Priority");
		prioInput.sendKeys(Keys.ENTER);
		prioCheckbox.click();

		reporterInput.click();
		reporterInput.clear();
		reporterInput.sendKeys("Reporter");
		reporterInput.sendKeys(Keys.ENTER);
		reporterCheckbox.click();
		
		summaryInput.click();
		summaryInput.clear();
		summaryInput.sendKeys("Summary");
		summaryInput.sendKeys(Keys.ENTER);
		summaryCheckbox.click();

		driverWait.until(ExpectedConditions.elementToBeClickable(nextButton));
		nextButton.click();
		
		driverWait.until(ExpectedConditions.elementToBeClickable(beginImportButton));
		beginImportButton.click();
		
		Thread.sleep(500000);
		
		driverWait.until(ExpectedConditions.elementToBeClickable(validatorToContinue));


	}
	
}
