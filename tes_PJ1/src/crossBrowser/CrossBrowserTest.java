package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import junit.framework.Assert;

public class CrossBrowserTest 
{
	public static WebDriver driver;
@org.testng.annotations.Test
public void GoogleTest()

{
	for(int browser=1;browser<4;browser++)
		
	{
		if(browser==1)
		{
			System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Chrome Driver Working");
		}
		else if(browser==2)
		{
			System.setProperty("webdriver.edge.driver", "E:\\mavenAutomation\\edgedriver_win64\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("Edge Driver  Working");
			
		}
		else if(browser==3)
		{
			System.setProperty("webdriver.gecko.driver", "E:\\mavenAutomation\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox Tested Working");
		}
//			
		driver.get("https://google.com");
		String title = driver.getTitle();
		Assert.assertEquals("Google", title);
		
		driver.close();	
	}

}		
	
}
