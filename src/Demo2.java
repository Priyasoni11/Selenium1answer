import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException{
       String expectedTitle1 = "Google";
        System.setProperty("webdriver.chrome.driver","/home/ttn/chromedriver");
        WebDriver obj = new ChromeDriver();
        obj.manage().window().maximize();
        obj.get("https://www.google.com/");
    }
}
