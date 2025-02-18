package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//Constructor
	
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	//Locaters;
	By text_Username_loc =By.xpath("//input[@placeholder='Username']");
	By text_password_loc = By.xpath("//input[@placeholder='Password']");
	By button_login_loc = By.xpath("//button[normalize-space()='Login']");
	
//Action Methods
	
	public void SetUserName(String user) {
		driver.findElement(text_Username_loc).sendKeys(user);
	}
	
	public void setPassword(String password) {
		driver.findElement(text_password_loc).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(button_login_loc).click();
	}
}
