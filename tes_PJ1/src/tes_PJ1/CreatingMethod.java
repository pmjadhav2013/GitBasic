package tes_PJ1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genderSelection("Female");
		genderSelection("Male");
		genderSelection("Custom");
				
	}

	public static void genderSelection(String gender)
	{
		System.setProperty("webdriver.driver.chromedriver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='"+gender+"']/following::input[1]")).click();
		System.out.println(gender + " checkbox selected ");
		
	}
}
