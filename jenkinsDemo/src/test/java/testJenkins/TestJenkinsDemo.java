package testJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestJenkinsDemo {

	WebDriver driver;
	@BeforeClass
	public void setupBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void openBrowser()
	{
		driver.get("https://www.google.com");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
