package booksToscrape;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePageClasses {
	WebDriver driver;
	WebDriverWait wait;

	// Logo link (clickable to return to homepage)
	@FindBy(css = "#default > header > div > div > div > a")
	WebElement clickLogoText;

	// Image of the first book in the list
	@FindBy(xpath = "//*[@id=\"default\"]/div/div/div/div/section/div[2]/ol/li[1]/article/div[1]/a/img")
	WebElement clickImage;

	// Book title on the product detail page
	@FindBy(css = "#content_inner > article > div.row > div.col-sm-6.product_main > h1")
	WebElement checkHeaderText;

	// Price of the book on the product detail page
	@FindBy(xpath = "//*[@id=\"content_inner\"]/article/div[1]/div[2]/p[1]")
	WebElement checkPrise;

	// Same logo as above (used to return back)
	@FindBy(css = "#default > header > div > div > div > a")
	WebElement clickBack;

	// All book cards on the main page
	@FindBy(css = "ol.row > li")
	List<WebElement> bookItems;

	// Constructor
	public HomePageClasses(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	// Click on the website logo
	public void logoTextClick() {
		wait.until(ExpectedConditions.elementToBeClickable(clickLogoText)).click();
	}

	// Click on the first book image
	public void imagesClick() {
		wait.until(ExpectedConditions.elementToBeClickable(clickImage)).click();
	}

	// Verify the book title on the detail page
	public void textCheck() {
		WebElement textMain = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector("#content_inner > article > div.row > div.col-sm-6.product_main > h1")));
		String actualText = textMain.getText();
		String expectedText = "A Light in the Attic";
		Assert.assertEquals(actualText, expectedText, "Book title does not match!");
	}

	// Verify the price of the book
	public void priceCheck() {
		WebElement priceMain = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"content_inner\"]/article/div[1]/div[2]/p[1]")));
		String actualPrice = priceMain.getText();
		String expectedPrice = "£51.77";
		Assert.assertEquals(actualPrice, expectedPrice, "Price does not match!");
	}

	// Return to the homepage
	public void backTofirstPage() {
		wait.until(ExpectedConditions.elementToBeClickable(clickBack)).click();
	}

	// Return number of book elements on the homepage
	public int getNumberOfBooks() {
		return bookItems.size();
	}
}
