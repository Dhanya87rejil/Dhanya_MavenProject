package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.internal.AbstractParallelWorker.Arguments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment20_SeleniumBrowserActions {

	static WebDriver driver;

	public static void main(String[] args) {

		// 1. Launch the Chrome browser window
		driver = new ChromeDriver();

		// 2. Maximize the browser window
		driver.manage().window().maximize();

		// 3. Delete all the cookies
		driver.manage().deleteAllCookies();

		// 4. Enter URL "https://parabank.parasoft.com/parabank&quot; and Launch the
		// application
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		// 5. Verify application title
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "ParaBank | Welcome | Online Banking", "Appln title doesn't match");

		// 6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed(), "Application logo not displayed");

		// 7. Verify application caption " Experience the difference"
		String caption = driver.findElement(By.xpath("//p[@class='caption']")).getText();
		Assert.assertEquals(caption, "Experience the difference", "Caption doesn't match");

		// 8. Enter Invalid credentials in Username (Invalid User) and Password (Empty)
		// textboxes
		WebElement username = driver.findElement(By.xpath("//div[@class='login']//input[@name='username']"));
		username.sendKeys("Invalid User");
		WebElement password = driver.findElement(By.xpath("//div[@class='login']//input[@name='password']"));
		password.clear();

		// 9. Click on Login Button
		WebElement loginButton = driver.findElement(By.xpath("//div[@class='login']//input[@value='Log In']"));
		loginButton.click();

		// 10. Verify error message is displayed (The username and password could not be
		// verified.)
		// Thread.sleep(2000); // Wait for 2 seconds to allow error message to appear
		// implicit wait message
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// explicit wait message
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));

		// verify error message
		WebElement errorMsg = driver.findElement(By.xpath("//p[@class='error']"));
		Assert.assertTrue(errorMsg.isDisplayed(), "Error Message not displayed");
		Assert.assertEquals(errorMsg.getText(), "Please enter a username and password.", "Error Message dopesnt match");

		// 11. Click on Adminpage link
		WebElement adminPageLink = driver.findElement(By.xpath("//ul[@class = 'leftmenu']//a[text()='Admin Page']"));
		adminPageLink.click();

		// 12. Wait for admin page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Administration')]"),
				0));

		// 13. Select Data access mode as ' SOAP'
		selectDataAccessMode("soap");

		// 14. Scrolldown till Loan provider

		WebElement LoanProvider = driver.findElement(By.xpath("//select[@id='loanProvider']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", LoanProvider);

		// 15. Select Loanprovider as 'Web Service'

		Select loanProviderSelect = new Select(LoanProvider);
		loanProviderSelect.selectByVisibleText("Web Service");

		// 16. Click on Submit button
		WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();

		// 17.wait for Successful submission message
		wait.until(ExpectedConditions
				.numberOfElementsToBeMoreThan(By.xpath("//b[ text()='Settings saved successfully.']"), 0));

		// 18.Click on Services Link
		WebElement servicesLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		servicesLink.click();

		// 19.Wait for Services page
		wait.until(ExpectedConditions
				.numberOfElementsToBeMoreThan(By.xpath("//Span[ text()='Available Bookstore SOAP services:']"), 0));

		// 20.Scrolldown till Bookstore services

		WebElement bookStoreServices = driver.findElement(By.xpath("//Span[ text()='Bookstore services:']"));
		js.executeScript("arguments[0].scrollIntoView(true)", bookStoreServices);

		// 21.Get total rows, columns in the bookstore service table
		List<WebElement> rows = driver
				.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr"));
		List<WebElement> columns = driver.findElements(
				By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr[1]//td"));
		int totalRows = rows.size();
		int totalColumns = columns.size();
		System.out.println("Total rows in bookstore services table: " + totalRows);
		System.out.println("Total columns in bookstore services table: " + totalColumns);

		// 22.Get Column headers of book store services table
		for (WebElement column : columns) {
			System.out.println(column.getText());
		}
		System.out.println("==================================");
		// 23.Get all the data from book store service table

		for (int r = 1; r <= totalRows; r++) {
			for (int c = 1; c <= totalColumns; c++) {
				WebElement cell = driver.findElement(
						By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr[" + r
								+ "]//td[" + c + "]"));

				System.out.println("ROW " + r + " COLUMN " + c + " Value is : " + cell.getText() + "");

			}
		}
		// 24.Close browser window
		driver.quit();

	}

	private static void selectDataAccessMode(String option) {

		WebElement dataAccessMode = driver.findElement(By.xpath("//input[@value='" + option + "']"));
		dataAccessMode.click();

	}

}
