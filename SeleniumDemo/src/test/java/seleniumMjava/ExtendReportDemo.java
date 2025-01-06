package seleniumMjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReportDemo {

	public static void main(String[] args) {
		//initialize the HtmlReporter 
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("RegressionTest.html");
		// Initialize ExtentReports and attach the HTMLReports
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1= extent.createTest("My First Test");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		test1.log(Status.INFO, "Starting test case");
		
		driver.get("https://www.facebook.com/");
		WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));
        emailField.sendKeys("invalid_username@example.com");
        passwordField.sendKeys("invalid_password");
        loginButton.click();
		test1.pass("Invalid facebook login");
		test1.info("Test Completed");
		
		ExtentTest test2= extent.createTest("My second Test");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		test2.log(Status.INFO, "Starting test case");
		
		driver.get("https://www.facebook.com/");
		test2.pass("valid to facebook login");
		test2.info("Test Completed");
		
		ExtentTest test3= extent.createTest("My third Test");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		test3.log(Status.INFO, "Starting test case");
		
		driver.get("https://www.facebook.com/");
		WebElement emailField1 = driver.findElement(By.id("email"));
        WebElement passwordField1 = driver.findElement(By.id("pass"));
        WebElement loginButton1 = driver.findElement(By.name("login"));
        emailField.sendKeys("invalid_username@example.com");
        passwordField.sendKeys("invalid_password");
        loginButton.click();
		test3.pass("Invalid facebook login");
		test3.info("Test Completed");
		
		extent.flush();
		
		

	}

}
