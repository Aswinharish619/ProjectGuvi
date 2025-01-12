package task_9;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Program_2_Demoblaze {

	public static void main(String[] args) throws Exception  {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		// driver.get("http://google.com");//navigate to google.com
		
		Thread.sleep(2000);

		driver.manage().window().maximize();

		if (driver.getTitle().equals("STORE")) {

			System.out.println("Page Landed on Correct website");
		} else {
			System.out.println("Page Not landed on Correct website");
		}

		//Print the page title
		System.out.println("Page title is: " + driver.getTitle());

	}

}
