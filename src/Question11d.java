//Q11   d- Validate that the title is  - "Login - My Store"
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Question11d {

    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        String actual= obj.getTitle();
        String Expected= "Login - My Store";
        if (actual.contains(Expected)) {
            System.out.println("Title is correct");}
        else{
            System.out.println("Wrong title");
        }
    }
}

