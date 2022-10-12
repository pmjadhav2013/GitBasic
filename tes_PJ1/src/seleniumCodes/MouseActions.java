package seleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement MyAccount = driver.findElement(By.id("nav-link-accountList"));
		act.moveToElement(MyAccount).perform();
		System.out.println("mosue is hoverd");
		act.contextClick(MyAccount);
		System.out.println("right click is done");
		act.click(MyAccount);
		System.out.println("clcik on my account link done");
	}

}
