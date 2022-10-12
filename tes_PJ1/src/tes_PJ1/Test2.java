package tes_PJ1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
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
		
		// printing without duplicates
//		Set<WebElement> s = new HashSet<>();
//		System.out.println("Links after removing duplicates:                  ");
//		for(WebElement name : links)
//		{
//			if(s.add(name)==false)
//			System.out.println(name);
//		}
		//driver.close();
		List<WebElement> linksWithoutDuplicate = new ArrayList<>();
		for (WebElement a:links)
		{
			if(!linksWithoutDuplicate.contains(a))
				linksWithoutDuplicate.add(a);
		}
		
		System.out.println("ALL links without duplicates");
		for(WebElement a:linksWithoutDuplicate )
		{
			System.out.println(a.getAttribute("href"));
		}
	}
}
