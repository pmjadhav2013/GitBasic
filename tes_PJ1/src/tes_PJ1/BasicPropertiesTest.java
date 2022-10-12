package tes_PJ1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicPropertiesTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Prashant Jadhav\\eclipse-PJ_practice\\tes_PJ1\\src\\Project.properties ");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("URL");
		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.id("Email"));
		Username.sendKeys(prop.getProperty("UserName"));
		WebElement Password = driver.findElement(By.id("Password"));
		Password.sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("(//input[@type= 'submit'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("((//a[@href='/logout'])[2]")).click();
		driver.close();
	}

}
