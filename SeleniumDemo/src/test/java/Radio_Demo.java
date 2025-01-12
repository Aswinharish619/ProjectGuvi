import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio_Demo {

	public static void main(String[] args) throws Exception {
		
		WebDriver Driver= new ChromeDriver();
		
		Driver.get("file:///C:/Users/haris/OneDrive/Desktop/Selenium%20Guvi/PracticeRadioButton.html");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//input[@value='apple']")).click();
		Driver.findElement(By.xpath("//input[@value='banana']")).click();
		Driver.findElement(By.xpath("//input[@value='orange']")).click();
		Driver.findElement(By.xpath("//label[4]")).click();
		
		List<WebElement> radio = Driver.findElements(By.xpath("//input[@type='radio']"));
	       
			System.out.println("Total Radio Buttons: " + radio.size());
	        
	        System.out.println(radio.get(0).isEnabled());
	        System.out.println(radio.get(1).isDisplayed());
	        System.out.println(radio.get(2).isSelected());
	        System.out.println(radio.get(3).isSelected());
	        
	   List<WebElement> radioLabels = Driver.findElements(By.xpath("//form/label"));
	   String expectedResult = "Banana";
	   
	   for (int i = 0; i < radio.size(); i++) {
           if (radioLabels.get(i).getText().equals(expectedResult)) {
               radioLabels.get(i).click();
               System.out.println(expectedResult + " clicked");
               break;
           }
       }
	        
	        Driver.close();
		
	}

}
