package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesFiles;
import demo.Log4j_Demo;
import io.github.bonigarcia.wdm.WebDriverManager;


public class PropertiesFileExample {


		WebDriver driver = null;
		public static String browserName = null;
		private static Logger logger = LogManager.getLogger(Log4j_Demo.class);
		
		@BeforeTest
	    public void setUpTest() {
			String projectPath = System.getProperty("user.dir");
			PropertiesFiles.getProperties();
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}//
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+ "\\Drivers\\GeckoDriver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		
		//System.setProperty("webdriver.chrome.driver","D:\\EclipseProjectWorkspace\\SeleniumJavaFramework2\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		logger.info("Browser Started");
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


