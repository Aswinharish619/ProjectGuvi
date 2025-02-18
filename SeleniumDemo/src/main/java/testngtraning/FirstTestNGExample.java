package testngtraning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNGExample {
	
	/*
	 * 1.Open Application 
	 * 2.Login Application 
	 * 3.Logout Appliaction
	 */
	WebDriver driver;
	@Test(priority=-3)
	public void openApplication() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
	}
	
	@Test(priority=-2)
	public void LoginVerify() {
		
		String LoginTitle=driver.getTitle();
		System.out.println(LoginTitle);
		if(LoginTitle.equals("Log into Facebook")) {
			System.out.println("Verified");
		}else {
			System.out.println("not Verified");
		}
		
	}
	
	@Test(priority=-1)
	public void Logout() {
		
		driver.quit();
		
	}

}
