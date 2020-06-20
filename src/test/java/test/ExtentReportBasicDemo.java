package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {
	private static WebDriver driver;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        ExtentTest test1 = extent.createTest("FB_HomePage-Test", "Sample description");

        System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjectWorkspace\\SeleniumJavaFramework2\\Drivers\\ChromeDriver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	test1.log(Status.INFO, "starting testcase");
    	driver.get("https://farebuzz.com");
    	test1.pass("Navigated to homepage");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='#SignIn'])[2]")).click();
		test1.pass("click signin link");
		driver.findElement(By.xpath("//a[@href='#TASignIn']")).click();
		test1.fail("click on TA tab");
		driver.close();
		driver.quit();
		test1.pass("Test Completed");
		System.out.println("Test Completed");
		
		ExtentTest test2 = extent.createTest("FB_HomePage-Test2", "Sample description");

        System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjectWorkspace\\SeleniumJavaFramework2\\Drivers\\ChromeDriver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	test2.log(Status.INFO, "starting testcase");
    	driver.get("https://farebuzz.com");
    	test2.pass("Navigated to homepage");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='#SignIn'])[2]")).click();
		test2.pass("click signin link");
		driver.findElement(By.xpath("//a[@href='#TASignIn']")).click();
		test2.pass("click on TA tab");
		driver.close();
		driver.quit();
		test2.pass("Test Completed");
		System.out.println("Test Completed");
		extent.flush();
	}

}
