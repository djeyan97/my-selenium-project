import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        driver.manage().window().maximize();

        //To Click Alert Box and Press Okay
        WebElement AlertBox = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button"));
        AlertBox.click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert1.accept();

        //To Click ConfirmBox and Press Cancel
        WebElement ConfirmBox = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/button"));
        ConfirmBox.click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert2.dismiss();

        //To Enter Text in PromptAlert Box
        WebElement PromptAlertBox = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/button"));
        PromptAlertBox.click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("John Wick");
        Thread.sleep(3000);
        alert3.accept();

    }
}
