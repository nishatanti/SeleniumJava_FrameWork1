package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgMultiBrowserDemo {
	
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	@Parameters("browserName")
	@BeforeTest	
	public void setUp(String browserName) { 
		System.out.println("Browser name is :" + browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath +"\\Drivers\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\Geckodriver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();			
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void test() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(4000);
		
	}

}
