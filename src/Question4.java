//Q3: Write a script to search the “To The New” string in google.
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Question4 {
    public static void main(String[] args) {
        String expectedTitle = "To The New";
        System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get("http://www.tothenew.com/");
        obj.findElement(new By.ByXPath
                ("/html/body/div[2]/div[2]/div/div[2]/button[2]")).sendKeys(Keys.ENTER);
        obj.findElement(new By.ByCssSelector("a[id='h-contact-us']")).sendKeys(Keys.ENTER);
    }
}
