package seleniumMjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssColorDemo2 {
	
	public static void main(String[] args) {
        
	 	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String ExpectedHexColor = "#0086ff";
        
        String BackgroundColor = driver.findElement(By.name("login")).getCssValue("background-color");
        System.out.println(BackgroundColor);
        
        Color hexCode = Color.fromString(BackgroundColor);
        String ActualHexColor = hexCode.asHex();
        
        System.out.println(ActualHexColor);
        
        if (ActualHexColor.equals(ExpectedHexColor)) {
            System.out.println("Validation Successful");
        }
    
}

}
