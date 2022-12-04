package SzakdolgozatPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverHelper {
	public static WebDriver driver = null; //ez hívja meg a basepage-t, ha 0 akkor csinál, ha nem akkor nem
	public WebDriver init() {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void quitDriver() {
		driver.quit();
		driver = null;
	}
}
