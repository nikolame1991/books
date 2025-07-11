package booksToscrape;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageClassTest extends BaseTestCase {

	// Navigate to homepage before each test
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://books.toscrape.com/");
	}

	// Clear cookies after each test
	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

	// Full test flow
	@Test
	public void testSmall() {
		booksToscrapePage.logoTextClick(); // Click logo
		booksToscrapePage.imagesClick(); // Click book image
		booksToscrapePage.textCheck(); // Verify book title
		booksToscrapePage.priceCheck(); // Verify book price
		booksToscrapePage.backTofirstPage(); // Return to homepage

		int actualNumber = booksToscrapePage.getNumberOfBooks(); // Count books
		int expectedNumber = 20;
		Assert.assertEquals(actualNumber, expectedNumber, "Number of books displayed is incorrect!");
	}
}
