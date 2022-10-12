package tes_PJ1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Hi this is basic test");
		
		System.setProperty("webdriver.chrome.driver", "E:\\mavenAutomation\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Hi this is basic test");
		
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://sandbox-nopcommerce44.gscadmin.com/");
		
		String ExpectedTitle = "Sandbox";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
//		try{
//			Assert.
//		}
		Thread.sleep(3000);
		driver.close();
	}

}
