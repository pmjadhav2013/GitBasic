package seleniumCodes;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		search.sendKeys(Keys.ENTER);
		
		// fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
		
		// for its presence once every 5 seconds.
		
		WebElement NPMLink = wait.until(new Function<WebDriver , WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.xpath("//*[text()='selenium-webdriver - npm']"));
			}
		});
			
		NPMLink.click();
		System.out.println("Its waited till page get loaded ");
	}

}
