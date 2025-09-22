package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) {
	
		/// 1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
		// 2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
		// 3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
		// 4: Open Google India homepage
		driver.get("https://www.google.com/");
		
		// 5: Locate the search box using cssSelector locator - Syntax 1 - tagName#id
		driver.findElement(By.cssSelector("textarea#APjFqb"));
		
		// 6: Locate the search box using cssSelector locator - Syntax 2 -tagName.className
		driver.findElement(By.cssSelector("textarea.gLFyf"));
		
		// 7: Locate the search box using cssSelector locator - Syntax 3 - tagName[attributes = 'attributeValue']
		driver.findElement(By.cssSelector("textArea[title='Search']"));

	}

}
