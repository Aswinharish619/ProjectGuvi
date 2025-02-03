package advance_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table_Find {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		Thread.sleep(3000);
		
		List<WebElement> allComp =driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[1]/a"));
		
		List<WebElement> allprice =driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[4]"));
		
		System.out.println("Total Companies"+allComp.size());
		
		String ExpectedComp="HFCL";
		for (int i=0; i<allComp.size();i++) {
			
			if(allComp.get(i).getText().equalsIgnoreCase(ExpectedComp)) {
				
				System.out.println(allComp.get(i).getText()+"===="+allprice.get(i).getText());
				
			}
			
		}

	}

}
