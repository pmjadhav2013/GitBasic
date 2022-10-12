package seleniumCodes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		
//		// implicit wait
//		System.out.println("waiting for element");
//		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//label[text()='Female']/following::input[1]"));
//		System.out.println("element displayed");
//		
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		System.out.println("waiting for element");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Female']/following::input[1]")));
	    System.out.println("element displayed");
	}

}
