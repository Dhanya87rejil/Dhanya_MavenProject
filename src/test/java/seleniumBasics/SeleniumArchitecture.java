package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumArchitecture {

	public static void main(String[] args) {
		//Create the instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//Launch the Application
		driver.get("https://www.selenium.dev/");
		//Close the browser
		driver.close();

	}

}
