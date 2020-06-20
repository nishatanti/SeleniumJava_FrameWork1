package test;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectofHomepage.FB_Homepage;

public class FareBuzzHomePageTest {
	

	private static WebDriver driver = null;
	
	public static void main(String[] args) {		
		LoginWithB2BUser();
	}
	
	public static void LoginWithB2BUser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjectWorkspace\\SeleniumJavaFramework2\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://farebuzz.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//a[@href='#SignIn'])[2]")).click();
		FB_Homepage.SignInLink(driver).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.xpath("//a[@href='#TASignIn']")).click();
		FB_Homepage.TravelAgentTab(driver).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$txtUsername")).sendKeys("FBTEST");;
		FB_Homepage.UserNameTextBox(driver).sendKeys("FBTEST");
		//driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$txtPassword")).sendKeys("FBTEST123");;
		FB_Homepage.PasswordTextBox(driver).sendKeys("FBTEST123");
		
		//driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$cmdLogin")).click();;
		FB_Homepage.SignInButton(driver).sendKeys(Keys.RETURN);
		//driver.findElement(By.id("ctl16_LoginTopMenu1_btnwelcome1")).isDisplayed();
		//FB_Homepage.UserloginWelcome(driver).isDisplayed();
		//driver.findElement(By.xpath("(//img[@src='images/arrow-icon-down.png'])[2]")).click();
		FB_Homepage.UserWelcomeDropdown(driver).click();
		//driver.findElement(By.id("myDropdown")).click();
		FB_Homepage.SignoutButton(driver).click() ;
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}

}
