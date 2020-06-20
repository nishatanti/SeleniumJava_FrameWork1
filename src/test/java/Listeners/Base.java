package Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	 public static WebDriver driver;

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjectWorkspace\\SeleniumJavaFramework2\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://farebuzz.com");
		driver.manage().window().maximize();

	}

	public void failed(String testMethodName) {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			//FileUtils.copyFile(SrcFile, new File("D:\\EclipseProjectWorkspace\\SeleniumJavaFramework2\\ScreenShots" + "\\test.png" ));
			FileUtils.copyFile(SrcFile, new File("D:\\EclipseProjectWorkspace\\SeleniumJavaFramework2\\ScreenShots\\"
					+testMethodName+ "_" + ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}




}		


