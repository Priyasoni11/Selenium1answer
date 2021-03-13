import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        obj.findElement(new By.ByCssSelector("input[id='email_create']")).sendKeys("priya.soni@tothenew.com");
        obj.findElement(new By.ByName("SubmitCreate")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        obj.findElement(new By.ByName("customer_firstname")).sendKeys("Priya");
        obj.findElement(new By.ByName("customer_lastname")).sendKeys("Soni");

    }
}