//Q11.  Write an automation script for filling all fields of the registration page.
// c- Validate the text on the page. "CREATE AN ACCOUNT"
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Question11c {

        public static void main(String[] args){
            System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
            WebDriver obj = new FirefoxDriver();
            obj.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
            if (obj.getPageSource().contains("Create an account")) {
                System.out.println("Create an account is present");}
                else{
                    System.out.println("Create an account not present");
                }
        }
    }

