package tes_PJ1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sandbox-nopcommerce44.gscadmin.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
//		WebElement search = driver.findElement(By.id("FirstName"));
///		search.sendKeys("Prashant");
//		search.clear();
//		search.sendKeys("prashant jadhav");
//		//System.out.println(search.getAttribute("aria-label"));
//		WebElement button = driver.findElement(By.id("register-button"));
//		System.out.println("register button color is: "+ button.getCssValue("color"));
		
		WebElement gender = driver.findElement(By.id("gender-male"));
		System.out.println("Radio button status: "+ gender.isSelected());
		driver.findElement(By.xpath("//*[@for='gender-male']")).click();
		//gender.click();
		System.out.println("Radio button status after click: "+ gender.isSelected());
	}

}
