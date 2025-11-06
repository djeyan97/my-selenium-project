import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRadioButtons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        driver.manage().window().maximize();

        //To find any one option in the Radio Button is selected by default
        WebElement RadioButton1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/input"));
        WebElement RadioButton2 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/input"));

        boolean default1 = RadioButton1.isSelected();
        boolean default2 = RadioButton2.isSelected();

        if (!RadioButton1.isSelected()) {
            System.out.println( default1 + " Radio button 1 is not selected by default.");
        } else {
            System.out.println( default1 + " Radio button 1 is selected by default.");
        }

        if (!RadioButton2.isSelected()) {
            System.out.println( default2 + " Radio button 2 is not selected by default.");
        } else {
            System.out.println( default2 + " Radio button 2 is selected by default.");
        }


        //To Click both the Radiobuttons
        WebElement Radiobutton1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/input"));
        Radiobutton1.click();
        Thread.sleep(3000);

        WebElement Radiobutton2 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/input"));
        Radiobutton2.click();

    }
}
