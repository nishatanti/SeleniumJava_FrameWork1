package PageObjectofHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FB_Homepage {

	private static WebElement element = null;
	public static WebElement SignInLink(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[@href='#SignIn'])[2]"));
		return element;
	}
	
	public static WebElement TravelAgentTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='#TASignIn']"));
		return element;
	}
	
	public static WebElement UserNameTextBox(WebDriver driver) {
		element = driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$txtUsername"));
		return element;
	}
	
	public static WebElement PasswordTextBox(WebDriver driver) {
		element = driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$txtPassword"));
		return element;
	}
	
	public static WebElement SignInButton(WebDriver driver) {
		element = driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$cmdLogin"));
		return element;
	}
	
	//public static WebElement UserloginWelcome(WebDriver driver) {
		//element = driver.findElement(By.id("ctl16_LoginTopMenu1_btnwelcome1"));
		//return element;
	//}
	
	public static WebElement UserWelcomeDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("(//img[@src='images/arrow-icon-down.png'])[2]"));
		return element;
	}
	
	public static WebElement SignoutButton(WebDriver driver) {
		element = driver.findElement(By.id("myDropdown"));
		return element;
	}


}
