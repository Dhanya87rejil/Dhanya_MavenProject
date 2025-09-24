package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment20_SeleniumBrowserActions {

	public static void main(String[] args) {

		// 1. Launch the Chrome browser window
		WebDriver driver = new ChromeDriver();

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

		// implicit wait message
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// explicit wait message
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));

         //verify error message
		WebElement errorMsg = driver.findElement(By.xpath("//p[@class='error']"));
		Assert.assertTrue(errorMsg.isDisplayed(), "Error Message not displayed");
		Assert.assertEquals(errorMsg.getText(), "Please enter a username and password.", "Error Message dopesnt match");

		// 11. Click on Adminpage link
		driver.findElement(By.xpath("//ul[@class = 'leftmenu']//a[text()='Admin Page']")).click();
		// 12. Wait for admin page
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='Submit']"))));

		// 13. Select Data access mode as ' SOAP'
		// 14. Scrolldown till Loan provider
		// 15. Select Loanprovider as 'Web Service'
		// 16. Click on Submit button
		// 17.wait for Successful submission message
		// 18.Click on Services Link
		// 19.Wait for Services page
		// 20.Scrolldown till Bookstore services
		// 21.Get total rows, columns in the bookstore service table
		// 22.Get Column headers of book store services table
		// 23.Get all the data from book store service table
		// 24.Close browser window
		driver.quit();

	}

}
