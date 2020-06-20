package test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemoWidTestNG {
	private static WebDriver driver;
	
	ExtentHtmlReporter htmlReporter = null;
	ExtentReports extent;
	@BeforeSuite
	public void setUp() {
		
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		    
	        // create ExtentReports and attach reporter(s)
	         extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);                		
	}
	
	@BeforeTest
	public void setUpTest() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjectWorkspace\\SeleniumJavaFramework2\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void Test1() throws Exception {
		ExtentTest test1 = extent.createTest("MyFirstTest", "Sample description");
		driver.get("https://farebuzz.com");
		test1.pass("Navigated to Farebuzz.com");
		test1.log(Status.INFO, "This step shows usage of log(status, details)");	        
        test1.info("This step shows usage of info(details)");	        	       
        test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());	       	        
        test1.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}
    @AfterSuite
	public void tearDown() {
		extent.flush();
	}
}
