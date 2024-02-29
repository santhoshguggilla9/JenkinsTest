package testJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestJenkinsDemo {

	WebDriver driver=null;
	@Parameters("browser")
	@BeforeClass
	public void setupBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
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
