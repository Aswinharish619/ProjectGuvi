
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/r.php?entry_point=login");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Click on a radio button
        driver.findElement(By.xpath("//input[@value='1']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='-1']")).click();

        // Find all radio buttons
        List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total Radio Buttons: " + radio.size());

        // Iterate through radio buttons and select one based on text
        List<WebElement> radioLabels = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
        String expectedResult = "Female";
        for (int i = 0; i < radioLabels.size(); i++) {
            if (radioLabels.get(i).getText().equals(expectedResult)) {
                radioLabels.get(i).click();
                System.out.println(expectedResult + " clicked");
                break;
            }
        }

        driver.quit();
    }
}
