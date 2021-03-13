//Q1. Write a script to open the Firefox browser and open https://www.google.com/ URL.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello");
        String expectedTitle = "Google";
        System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.google.com/");
    }
}