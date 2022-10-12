package tes_PJ1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		System.out.println("this is testing");
		driver.navigate().to("https://sandbox-nopcommerce44.gscadmin.com/");
//		Thread.sleep(1200);
//		driver.navigate().back();
//		System.out.println("going to back");
//		Thread.sleep(1000);
//		driver.navigate().forward();
//	
//		Thread.sleep(1000);
//		
//		driver.navigate().refresh(); // refreshing website
//		driver.close();
//		System.out.println("testing ends");
		System.out.println("All links on the Page");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement l:allLinks)
		{
			System.out.println(l.getAttribute("href"));
		}
	}

}
