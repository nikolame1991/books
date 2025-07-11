package booksToscrape;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestCase {
	WebDriver driver;
	HomePageClasses booksToscrapePage;

	// Setup WebDriver and initialize page class
	@BeforeTest
	public void initalization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		booksToscrapePage = new HomePageClasses(driver);
	}

	// Close browser after all tests
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
