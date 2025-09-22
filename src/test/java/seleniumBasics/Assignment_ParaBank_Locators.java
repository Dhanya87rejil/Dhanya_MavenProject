package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_ParaBank_Locators {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	//Header Panel - left menu
	driver.findElement(By.cssSelector("li[class='Solutions']"));
	//driver.findElement(By.cssSelector("ul[class='leftmenu'] > li >  a[href='about.htm']"));
	
	//customer login
	driver.findElement(By.name("username"));
	driver.findElement(By.name("password"));
	driver.findElement(By.cssSelector("input[value='Log In']"));
	driver.findElement(By.linkText("Forgot login info?"));
	driver.findElement(By.linkText("Register"));
	
	//Welcome to parabank Buttons
	driver.findElement(By.cssSelector("li[class='home']"));
	driver.findElement(By.cssSelector("li[class='aboutus']"));
	driver.findElement(By.cssSelector("li[class='contact']"));

	//footer links
	driver.findElement(By.linkText("Contact Us"));
	driver.findElement(By.linkText("Site Map"));
	driver.findElement(By.linkText("Forum"));
	driver.findElement(By.linkText("Services"));
	//driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li>a[href='index.htm']"));
	//driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li>a[href='about.htm']"));
	//driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li>a[href='services.htm']"));
	driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li>a[href='http://www.parasoft.com/jsp/products.jsp']"));
	driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li>a[href='http://www.parasoft.com/jsp/pr/contacts.jsp']"));
	driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li>a[href='http://forums.parasoft.com/']"));
	//driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li>a[href='sitemap.htm']"));
	//driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li>a[href='contact.htm']"));

	//menu links(top and bottom)
	
	
	
	
	}

}
