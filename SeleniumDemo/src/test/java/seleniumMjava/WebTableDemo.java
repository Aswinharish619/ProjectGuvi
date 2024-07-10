package seleniumMjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {

	public static void main(String[] args) throws Exception {
		 WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://money.rediff.com/gainers");
		    driver.manage().window().maximize();
		    Thread.sleep(1500);
		    //create list of all companies
		    
		    List <WebElement> allCompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		    System.out.println("Total Num companies"+allCompanies.size());
		    
		    String expectedCompName="PTC Industries";
		    for (int i =0;i<allCompanies.size();i++) {
		    	
		    	if(allCompanies.get(i).getText().equalsIgnoreCase(expectedCompName)) {
		    		System.out.println("got the company");
		    		Thread.sleep(1500);
		    	driver.close();	
		    	}
		    	
		    }
		     
		    
		    
		    
		    

	}

}
