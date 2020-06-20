package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectofHomepage.FB_HomepageBetterPO;

public class FB_HomePage_Test4rBtrPO {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		fbhomepageTest();
	}
	
	public static void fbhomepageTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjectWorkspace\\SeleniumJavaFramework2\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		FB_HomepageBetterPO fbhompageobj = new FB_HomepageBetterPO(driver);
		driver.get("https://farebuzz.com");
		driver.manage().window().maximize();
		fbhompageobj.click_SignInLink();
		fbhompageobj.click_TravelAgentTab();
		fbhompageobj.Enter_Username("FBTEST");
		fbhompageobj.Enter_Password("FBTEST123");
		fbhompageobj.click_SignInButton();
		fbhompageobj.click_UserWelcomeDropdown();
		fbhompageobj.click_SignoutButton();
		driver.close();
		System.out.println("Test Passed Succesfully");
	}

}
