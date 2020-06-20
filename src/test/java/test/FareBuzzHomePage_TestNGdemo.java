package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FareBuzzHomePage_TestNGdemo {
	WebDriver driver = null;
	

	@BeforeTest
    public void setUpTest() {
	//String projectPath = System.getProperty("user.dir");
	//System.setProperty("webdriver.chrome.driver",projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","D:\\EclipseProjectWorkspace\\SeleniumJavaFramework2\\Drivers\\ChromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
}
	@Test
	public void LoginWithB2BUser() {		
		driver.get("https://farebuzz.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='#SignIn'])[2]")).click();
		driver.findElement(By.xpath("//a[@href='#TASignIn']")).click();
		driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$txtUsername")).sendKeys("FBTEST");;
		driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$txtPassword")).sendKeys("FBTEST123");;
		driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$cmdLogin")).click();;
		driver.findElement(By.id("ctl16_LoginTopMenu1_btnwelcome1")).isDisplayed();
		driver.findElement(By.xpath("(//img[@src='images/arrow-icon-down.png'])[2]")).click();
		driver.findElement(By.id("myDropdown")).click();		
	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}

}
