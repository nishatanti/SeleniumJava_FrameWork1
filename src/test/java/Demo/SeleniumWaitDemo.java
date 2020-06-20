package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		seleniumWaits();
	}
	
	public static void seleniumWaits() {
		
	 
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe");
			
		    WebDriver driver = new ChromeDriver();
		    
		    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://farebuzz.com ");
		    driver.manage().window().maximize();
			driver.findElement(By.xpath("(//a[@href='#SignIn'])[2]")).click();
			driver.findElement(By.xpath("//a[@href='#TASignIn']")).click();
			driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$txtUsername")).sendKeys("FBTEST");;
			driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$txtPassword")).sendKeys("FBTEST123");;
			driver.findElement(By.name("ctl16$LoginTopMenu1$UserLogin$cmdLogin")).click();
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
			
			
			
			driver.findElement(By.name("abcd")).click();
			driver.close();
			driver.quit();
		}
	}


