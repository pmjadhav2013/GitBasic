package tes_PJ1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// using readymade method
public class Test3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sandbox-nopcommerce44.gscadmin.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("ALL links");
		for(WebElement a:links )
		{
			System.out.println(a.getAttribute("href"));
		}
		// now removing duplicates
		List<WebElement> linksWithoutDuplicate = links
		.stream()
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println("ALL links without Duplicates ::::::::::");
		
		for(WebElement b:linksWithoutDuplicate )
		{
			System.out.println(b.getAttribute("href"));
		}
		driver.close();
	}
}
