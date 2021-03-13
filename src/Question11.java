//Q11.  Write an automation script for filling all fields of the registration page.
// b- Validate that your respective gender is selected or not.
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Question11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","/home/ttn/geckodriver" );
        WebDriver obj = new FirefoxDriver();
        obj.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        obj.findElement(new By.ByCssSelector("input[id='email_create']")).sendKeys("priya.soni@tothenew.com");
        obj.findElement(new By.ByName("SubmitCreate")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        WebElement element =obj.findElement(new By.ById("id_gender2"));
        element.click();
        System.out.println("Mrs is selected: "+element.isSelected());

    }
}