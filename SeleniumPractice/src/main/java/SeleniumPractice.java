import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        //WebElement textbox = driver.findElement(By.linkText("Home"));
        //textbox.click();

        WebElement NameBox = driver.findElement(By.id("userName"));
        NameBox.sendKeys("Deepak Jeyan" + Keys.ENTER);

        WebElement EmailBox = driver.findElement(By.id("userEmail"));
        EmailBox.sendKeys("deepak@123" + Keys.ENTER);

        WebElement AddressBox = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
        AddressBox.sendKeys("123 Bharathiyar street" + Keys.ENTER);

        WebElement Value = driver.findElement(By.id("userEmail"));
        String placeholder = Value.getAttribute("placeholder");
        System.out.println(placeholder);

        WebElement EnabledTextBox = driver.findElement(By.id("permanentAddress"));
        Boolean isEnabled = EnabledTextBox.isEnabled();
        System.out.println(isEnabled);
    }
}
