package tes_PJ1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUniqueFromList {
// when multiple elements with same class name will egt then to find first / unique xpath will be like: (xpath)[count]
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/addtariffplans.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@class='3u 12u$(small)'])[2]/input")).sendKeys("12345");
		
	}

}
