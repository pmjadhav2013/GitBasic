package tes_PJ1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[starts-with(@id,'pass')])")).sendKeys("prashant");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("prashant");
		//Boolean a = driver.findElement(By.xpath("//a[text()='Already have an account?']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='Female']/following::input[1]")).click();
	}

}
