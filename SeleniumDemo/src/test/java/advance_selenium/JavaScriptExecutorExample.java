package advance_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorExample {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//System.out.println(js.executeScript("return window.pageYoffset"));
		//Thread.sleep(2000);
		
		//js.executeScript("window.scrollBy(0,350)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		//Thread.sleep(2000);
		
		//WebElement element=driver.findElement(By.xpath("//h2[text()='Selenium IDE']"));
		//js.executeScript("arguments[0].scrollIntoView();",element);
		//Thread.sleep(2000);
		//System.out.println("Hello world " +js.executeScript("return window.pageYOffset;"));
		
		//scroll page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", args);
		Thread.sleep(2000);
		System.out.println("Hello world " +js.executeScript("return window.pageYOffset;"));
		
		//side wise width and X axis we have to mention
		
		
		driver.quit();
		
	}

}
