package drag_drop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	}

}
