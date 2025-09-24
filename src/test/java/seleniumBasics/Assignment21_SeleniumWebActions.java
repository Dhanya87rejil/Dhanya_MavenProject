package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment21_SeleniumWebActions {

	public static void main(String[] args) {
		
	
		//1. Launch browser window(Chrome)    
		WebDriver driver = new ChromeDriver();
		
		//2. Maximize the browser window
		driver.manage().window().maximize();
		
		//3. Delete all the cookies  
		driver.manage().deleteAllCookies();
		
		//4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)  
		driver.get("https://demoqa.com/automation-practice-form");
		
		//5. Wait for Page-load
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@type='submit']"))));
		
		//6. Enter First name and Last name     
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		firstname.sendKeys("Dhanya");
		lastname.sendKeys("Purushothaman");
		
		//7. Enter Email 
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("dhanya.ican@gmail.com");
		
		//8. Select Gender (Female)     
		WebElement gender = driver.findElement(By.xpath("//label[text()=\"Female\"]"));
		gender.click();
		
		//9. Enter mobile number 
		WebElement mobileNo = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNo.sendKeys("9981245678");
		
		//10.Select DOB (1-Feb-1991)
		WebElement DOB = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		DOB.click();
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']//option[@value='1986']"));
		year.click();
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']//option[text()='June']"));
		month.click();
		WebElement date = driver.findElement(By.xpath("//div[@class='react-datepicker__week']//div[@class='react-datepicker__day react-datepicker__day--012']"));
		date.click();
		
		//11.Search and Select Computer Science
		//WebElement subjects = driver.findElement(By.xpath("//div[@id='subjectsContainer']//div[contains(@class,'subjects-auto-complete__control ')]"));
		//subjects.sendKeys("Computer Science");

		//12.Select Hobbies as Sports and Reading   
		WebElement sportsCheckbox = driver.findElement(By.xpath("//label[text()='Sports']"));
		WebElement readingCheckbox = driver.findElement(By.xpath("//label[text()='Reading']"));
		WebElement musicCheckbox = driver.findElement(By.xpath("//label[text()='Music']"));
		sportsCheckbox.click();
		readingCheckbox.click();
		musicCheckbox.click();
		//13.Upload photo      
		//input[@id='uploadPicture']
		
		//14. Wait till file upload   
		
		//15.Submit Details  
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		
		//16. Close browser window
	driver.quit();
	}

}
