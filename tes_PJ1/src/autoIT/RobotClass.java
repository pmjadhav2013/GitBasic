package autoIT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlinepngtools.com/convert-jpg-to-png");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@class='preview'])[1]")).click();
		Thread.sleep(4000);
		StringSelection sel = new StringSelection("C:\\Users\\Prashant Jadhav\\Desktop\\fileUploadAutoIT\\img1.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		// now use robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Image uplaoded");
		driver.close();
		
	}

}
