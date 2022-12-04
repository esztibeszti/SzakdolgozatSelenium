package SzakdolgozatPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import SzakdolgozatPackage.Pages.AtlassianLogin;
import SzakdolgozatPackage.Pages.CreateKanbanProject;
import SzakdolgozatPackage.Pages.CreateScrumProject;
import SzakdolgozatPackage.Pages.IssueCreateBulk;
import SzakdolgozatPackage.Pages.JiraCloudBasePage;
import SzakdolgozatPackage.Pages.ProjectsTrash;

public class TestNG {
	public String username = "szakdolgozat.biralo@gmail.com";
	public String password = "Biralo0123!PASS";
	public String issueSummary = "Selenium Task";
	public String taskType = "Task";
	public String projectname = "Selenium Test";


	 @BeforeTest public void beforeTest() {
		 
	 }

	public void loginAtlassian() throws InterruptedException {
		new AtlassianLogin().loginAtlassian(username, password);
		
	}
	
	@Test
	public void menu() throws InterruptedException {
		loginAtlassian();
		JiraCloudBasePage jiraCloudBasePage = new JiraCloudBasePage();
		jiraCloudBasePage.openProjectsMenu();
		jiraCloudBasePage.createProjectMenu();
		new CreateScrumProject().createScrumProject(projectname);
		IssueCreateBulk issueCreateBulk = new IssueCreateBulk();
		issueCreateBulk.issueBulk(projectname);
		ProjectsTrash projectTrash = new ProjectsTrash();
		projectTrash.deleteProject(projectname);
	}
	
	/*@Test
	public void issueBulkUpload() throws InterruptedException {
		loginAtlassian();
		new IssueCreateBulk().issueBulk();
	}
	*/

	@AfterTest
	public void afterTest() {
		
		DriverHelper.quitDriver();
	}

}
