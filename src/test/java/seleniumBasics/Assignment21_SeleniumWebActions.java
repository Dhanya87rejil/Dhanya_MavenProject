package seleniumBasics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment21_SeleniumWebActions {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		// 1. Launch browser window(Chrome)
		driver = new ChromeDriver();

		// 2. Maximize the browser window
		driver.manage().window().maximize();

		// 3. Delete all the cookies
		driver.manage().deleteAllCookies();

		// 4. Enter URL and Launch the application
		// (https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");

		// 5. Wait for Page-load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@type='submit']"))));

		// 6. Enter First name and Last name
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		firstname.sendKeys("Dhanya");
		lastname.sendKeys("Purushothaman");

		// 7. Enter Email
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("dhanya.ican@gmail.com");

		// 8. Select Gender (Female)
		selectGender("Female");

		// 9. Enter mobile number
		WebElement mobileNo = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNo.sendKeys("9981245678");

		// 10.Select DOB (1-Feb-1991)

		selectDOB("12", "June", "1987");

		// 11.Search and Select Computer Science
		selectSubject("Computer Science");

		// WebElement subjects =
		// driver.findElement(By.xpath("//div[@id='subjectsContainer']//div[contains(@class,'subjects-auto-complete__control
		// ')]"));
		// subjects.sendKeys("Computer Science");

		// 12.Select Hobbies as Sports and Reading
		String[] hobbies = { "Sports", "Reading" };
		selectHobbies(hobbies);

		// 13.Upload photo
		WebElement uploadPicture = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadPicture.sendKeys(System.getProperty("user.dir") + "\\Files\\image_2.jpg"); // input[@id='uploadPicture']

		// 14. Wait till file upload

		// 15.Submit Details
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submit);
		
		//Take screenshot of complete page
		getScreenshot(driver,"CompletePage");
		

		// 16. Close browser window
		driver.quit();
	}

	public static void selectSubject(String subject) {
		WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));

		Actions actions = new Actions(driver);
		actions.sendKeys(subjectInput, subject).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
				By.xpath("//div[contains(@class,'option') and text()='" + subject + "']"), 0));

		WebElement subjectOption = driver
				.findElement(By.xpath("//div[contains(@class,'option') and text()='" + subject + "']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", subjectOption);
	}

	public static void selectGender(String gender) {
		WebElement genderRadioButton = driver.findElement(By.xpath("//label[text()='"+gender+"']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", genderRadioButton);
	}

	public static void selectDOB(String date, String month, String year) {
		// Launch the DOB calendar
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();

		// Locate the month dropdown and select the month
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select selectMonth = new Select(monthDropdown);
		selectMonth.selectByVisibleText(month);

		// Locate the year dropdown and select the year
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByVisibleText(year);

		// Select the date
		//// div[text()='1' and contains(@aria-label,'January')]
		WebElement datePicker = driver
				.findElement(By.xpath("//div[text()='" + date + "' and contains(@aria-label,'" + month + "')]"));
		datePicker.click();
	}

	public static void selectHobbies(String[] hobbies) {
		for (String hobby : hobbies) {
			WebElement hobbyCheckbox = driver.findElement(By.xpath("//label[text()='" + hobby + "']"));
			if (!hobbyCheckbox.isSelected()) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", hobbyCheckbox);
			}
		}
	}
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String destination = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName + ".png";
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(destination));
		return destination;
	}
}