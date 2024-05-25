package task_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haris\\OneDrive\\Documents\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoblaze.com/");

		driver.manage().window().maximize();
		
		String S1=driver.getTitle();
		
		String S2="STORE";
		
		if(S1.equals(S2)){
			
			System.out.println("Page landed on the correct site");
			System.out.println("Original Title-->"+driver.getTitle());
			
		}else {
			System.out.println("Page not landed on the correct site");
			System.out.println("driver.getTitle()");
			System.out.println("Original Title-->"+driver.getTitle());
		}
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
