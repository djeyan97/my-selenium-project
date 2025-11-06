import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ValidateErrorMessage {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        List<WebElement> messages = driver.findElements(By.cssSelector("#error"));

        StringBuilder result = new StringBuilder();

        for (WebElement e : messages) {
            System.out.println("Displayed: " + e.isDisplayed());
            System.out.println("Raw text: [" + e.getText() + "]");
        }

        for (WebElement e : messages) {
            result.append(e.getText()).append(" | ");
        }

        String ErrorMessages = result.toString().trim();
        System.out.println("ErrorMessages: "+ ErrorMessages);

        if (ErrorMessages.contains("Your username is invalid!") && ErrorMessages.contains("Your password is invalid!")) {
            System.out.println("Test Passed");
        }
        else  {
            System.out.println("Test Failed");
        }
          driver.quit();
    }
}

