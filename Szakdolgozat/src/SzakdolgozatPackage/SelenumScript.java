package SzakdolgozatPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SelenumScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://szakdolgozatkecskesdeszter.atlassian.net/jira"); //Atlassian Jira megnyitasa
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//Belepes
		
		
		driver.findElement(By.id("username"));
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("szakdolgozat.biralo@gmail.com"); //beirja az email cimet
		
		driver.findElement(By.id("login-submit")).click(); //megnyomja a continue gombot
		
		Thread.sleep(4000); //var 4 mp-t
		
		driver.findElement(By.id("password"));
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Biralo0123!PASS"); //beirja a jelszot
		driver.findElement(By.id("login-submit")).click();
		 
		
		//driver.quit(); //bezar minden megnyitott oldalt
		
		//Create Issue
		Thread.sleep(4000);
		driver.findElement(By.id("createGlobalItem")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("summary-field"));
		WebElement summary=driver.findElement(By.id("summary-field"));
		summary.sendKeys("Selenium Task");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("components")).click();
		
		
		
		
	}

}
