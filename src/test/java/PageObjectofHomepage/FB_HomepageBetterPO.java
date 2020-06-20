package PageObjectofHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FB_HomepageBetterPO {
	//whenever below driver called test case 
	//it will not do any action
	//so we will use the instance of that driver using constructor
	WebDriver driver = null;

	//objects locators in a better ways
	By SignInLink  = By.xpath("(//a[@href='#SignIn'])[2]");

	By TravelAgentTab = By.xpath("//a[@href='#TASignIn']");

	By UserNameTextBox = By.name("ctl16$LoginTopMenu1$UserLogin$txtUsername");

	By PasswordTextBox = By.name("ctl16$LoginTopMenu1$UserLogin$txtPassword");

	By SignInButton = By.name("ctl16$LoginTopMenu1$UserLogin$cmdLogin");

	By UserWelcomeDropdown = By.xpath("(//img[@src='images/arrow-icon-down.png'])[2]");

	By SignoutButton = By.id("myDropdown");
	//Constructors 
	public FB_HomepageBetterPO(WebDriver driver) {
		this.driver = driver;
	}

    //Actions
	public void click_SignInLink() {
		driver.findElement(SignInLink).click();
	}
	public void click_TravelAgentTab() {
		driver.findElement(TravelAgentTab).click();
	}
	public void Enter_Username(String text) {
		driver.findElement(UserNameTextBox).sendKeys(text);
	}
	public void Enter_Password(String text) {
		driver.findElement(PasswordTextBox).sendKeys(text);
	}
	public void click_SignInButton() {
		driver.findElement(SignInButton).click();
	}
	public void click_UserWelcomeDropdown() {
		driver.findElement(UserWelcomeDropdown).click();
	}
	public void click_SignoutButton() {
		driver.findElement(SignoutButton).click();
	}


}
