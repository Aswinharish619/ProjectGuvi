package task_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveWindow_1 {

	public static void main(String[] args) throws InterruptedException    {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		Thread.sleep(2000);
				
		Set<String> windowsIds = driver.getWindowHandles();
		List<String> windowList = new ArrayList(windowsIds);
		String parentId = windowList.get(0);
		System.out.println(parentId);
		String childId = windowList.get(1);
		System.out.println(childId);
		
		// switch to child window
		driver.switchTo().window(childId);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		// switch to parent window
		driver.switchTo().window(parentId);
		System.out.println(driver.getCurrentUrl());// to check the window is active
		System.out.println("The current window is active.");
	}

}
