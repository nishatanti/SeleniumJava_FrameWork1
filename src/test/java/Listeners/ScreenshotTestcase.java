 package Listeners;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CutomListener.class)
public class ScreenshotTestcase extends Base {
	
	@BeforeMethod
	public void setUp() {
		initialization(); 		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void takeScreenshotTest1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takeScreenshotTest2() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takeScreenshotTest4() {
		Assert.assertEquals(true, true);
		
	}

}
