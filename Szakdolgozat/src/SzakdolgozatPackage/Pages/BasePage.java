package SzakdolgozatPackage.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import SzakdolgozatPackage.DriverHelper;

public class BasePage {
	protected final WebDriver driver;
	protected final WebDriverWait driverWait;

	public BasePage() {
		this.driver = new DriverHelper().init();
		this.driverWait = new WebDriverWait(driver, Duration.ofMillis(5000));
		PageFactory.initElements(driver, this);
	}
}
