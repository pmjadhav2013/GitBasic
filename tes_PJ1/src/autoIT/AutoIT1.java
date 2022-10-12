package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlinepngtools.com/convert-jpg-to-png");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@class='preview'])[1]")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\Prashant Jadhav\\Desktop\\fileUploadAutoIT\\fildUp.exe");
		//Runtime.getRuntime().exec("D:\\AutoIT\\FileUploader2.exe");
		System.out.println("File uplaod successfull");
	}

}
