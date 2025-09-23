package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Parabank_XpathLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		//left menus
		driver.findElement(By.xpath("//li[@class='Solutions']"));//method 1
		driver.findElement(By.xpath("//li[text()='Solutions']"));//method 2
		driver.findElement(By.xpath("//ul[@class = 'leftmenu']//a[text()='About Us']"));
		driver.findElement(By.xpath("//ul[@class = 'leftmenu']//a[text()='Services']"));
		driver.findElement(By.xpath("//ul[@class = 'leftmenu']//a[text()='Products']"));
		driver.findElement(By.xpath("//ul[@class = 'leftmenu']//a[text()='Locations']"));
		driver.findElement(By.xpath("//ul[@class = 'leftmenu']//a[text()='Admin Page']"));
		//buttons
		driver.findElement(By.xpath("//ul[@class = 'button']//li//a[text()='home']"));
		driver.findElement(By.xpath("//ul[@class = 'button']//li//a[text()='about']"));
		driver.findElement(By.xpath("//ul[@class = 'button']//li//a[text()='contact']"));
		//login
		
		driver.findElement(By.xpath("//div[@class='login']//input[@name='username']"));
		driver.findElement(By.xpath("//div[@class='login']//input[@name='password']"));
		driver.findElement(By.xpath("//div[@class='login']//input[@value='Log In']"));
		driver.findElement(By.xpath("//p//a[contains(@href,'lookup')]"));
		driver.findElement(By.xpath("//p//a[contains(@href,'register')]"));
		
		//ATM services
		driver.findElement(By.xpath("//ul[@class='services']//li/a[text()='Withdraw Funds']"));
		driver.findElement(By.xpath("//ul[@class='services']//li/a[text()='Transfer Funds']"));
		driver.findElement(By.xpath("//ul[@class='services']//li/a[text()='Check Balances']"));
		driver.findElement(By.xpath("//ul[@class='services']//li/a[text()='Make Deposits']"));
		//REad More
		driver.findElement(By.xpath("//p[@class='more']/a[contains(@href,'services')]"));
		driver.findElement(By.xpath("//p[@class='more']/a[contains(@href,'news')]"));
		
		//bottom menu
		
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='Home']"));
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='About Us']"));
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='Services']"));
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='Products']"));
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='Locations']"));
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='Forum']"));
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='Site Map']"));
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='Contact Us']"));
		
	

	}

}
