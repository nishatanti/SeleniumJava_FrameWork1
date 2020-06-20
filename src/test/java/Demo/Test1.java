package Demo;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	String projectPath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe");
	
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1() throws Exception {
    driver.get("https://www.farebuzz.com/?farebuzz96");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("(//a[contains(text(),'Sign-In')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Travel Agent')])[2]")).click();
    driver.findElement(By.id("ctl16_LoginTopMenu1_UserLogin_txtUsername")).click();
    driver.findElement(By.id("ctl16_LoginTopMenu1_UserLogin_txtUsername")).clear();
    driver.findElement(By.id("ctl16_LoginTopMenu1_UserLogin_txtUsername")).sendKeys("FBTEST");
    driver.findElement(By.id("ctl16_LoginTopMenu1_UserLogin_txtPassword")).click();
    driver.findElement(By.id("ctl16_LoginTopMenu1_UserLogin_txtPassword")).clear();
    driver.findElement(By.id("ctl16_LoginTopMenu1_UserLogin_txtPassword")).sendKeys("FBTEST123");
    driver.findElement(By.id("ctl16_LoginTopMenu1_UserLogin_cmdLogin")).click();
    driver.findElement(By.xpath("//div[@id='ctl16_LoginTopMenu1_pnlprofileLnk']/div[2]/div/div/img")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Sign Out')])[2]")).click();
    driver.close();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
