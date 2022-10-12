package seleniumCodes;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluetTest {

	WebDriver driver;
	@Test
	public void fluentWaitTest() throws InterruptedException
	{
	System.setProperty
	("webdriver.chrome.driver","E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe"
	);
	driver = new ChromeDriver();
	driver.get("https://www.google.com/" );
	driver.manage().window().maximize() ;
	//Searching for a WebElemet which is there in diff page
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("selenium");
	search.sendKeys(Keys.ENTER);
	//Case - I
	//WebElement search2=driver.findElement(By.xpath("//*[text()='selenium-webdriver - npm']"));
	//search2.click();//Will get NoSuchElementException here
	//Case - II
	//Syntax of Fluent Wait for a Particular WebElement
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	.withTimeout(Duration.ofSeconds(30))
	.pollingEvery(Duration.ofSeconds(5))
	.ignoring(NoSuchElementException.class);
	WebElement seleniumNPMLink = wait.until(new Function<WebDriver, WebElement>(){
	public WebElement apply(WebDriver driver ) {
	return driver.findElement(By.xpath("//*[text()='selenium-webdriver - npm']"));
	}
	});
	//click on the selenium link
	seleniumNPMLink.click();
	driver.close() ;
	}

}
