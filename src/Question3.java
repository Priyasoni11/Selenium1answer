//Q3: Write a script to search the “To The New” string in google.
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Question3 {
    public static void main(String[] args) {
        String expectedTitle = "Google";
        System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.google.com/");
        obj.findElement(new By.ByCssSelector("input[name='q']")).sendKeys("To The New");
        obj.findElement(new By.ByCssSelector("input[name='q']")).sendKeys(Keys.ENTER);
    }
}
