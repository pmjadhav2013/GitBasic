package tes_PJ1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.id("pass")).sendKeys("prashant");
		//driver.findElement(By.name("pass")).sendKeys("prashant");
		//driver.findElement(By.cssSelector("input[id=email]")).sendKeys("prashant");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("prashant");
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("prashant");
		//driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("prashant");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("prashant");
		//driver.findElement(By.cssSelector("input[id^='ema']")).sendKeys("prashant"); //when last chara are changing
		//driver.findElement(By.cssSelector("input[id$='ail']")).sendKeys("prashant"); //when last chara are changing
		driver.findElement(By.cssSelector("input[id*='mai']")).sendKeys("prashant"); //when middle is not changing
		//driver.close();
	}

}
