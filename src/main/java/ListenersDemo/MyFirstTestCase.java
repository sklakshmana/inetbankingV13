package ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

//@Listeners(ListenersDemo.TestNGListener.class)
public class MyFirstTestCase 
{
	@Test
	public void GoogleTitleVerify()
	{
		System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	@Test
	public void TitleMatch()
	{
		System.out.println("Test 2 Dummy");
		Assert.assertTrue(false);
	}

}
