import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        driver.manage().window().maximize();

        //To check if any one of the checkboxes are selected by default
        WebElement CheckBox1 = driver.findElement(By.xpath("//*[@id=\"c_bs_1\"]"));
        WebElement CheckBox2 = driver.findElement(By.xpath("//*[@id=\"c_bs_2\"]"));

        boolean Status1 = CheckBox1.isSelected();
        boolean Status2 = CheckBox1.isSelected();

        if(!CheckBox1.isSelected()) {
            System.out.println(Status1 + " The Checkbox 1 is not selected by default");
        }
            else {
                System.out.println(Status1 + " The Checkbox 1 is selected by default");
            }

        if(!CheckBox2.isSelected()) {
            System.out.println(Status2 + " The Checkbox 2 is not selected by default");
        }
        else {
            System.out.println(Status2 + " The Checkbox 2 is selected by default");
        }

        //To click or select the checkbox
        WebElement clickCheckbox = driver.findElement(By.xpath("//*[@id=\"c_bs_1\"]"));
        clickCheckbox.click();
        Thread.sleep(2000);

        //Deselect the selected Checkbox
        WebElement DeselectCheckBox = driver.findElement(By.xpath("//*[@id=\"c_bs_1\"]"));
        if (clickCheckbox.isSelected()) {
            clickCheckbox.click();
        }

        //Select all the CheckBox
        WebElement PlusDropDown = driver.findElement(By.xpath("//*[@id=\"bs_1\"]/span[1]"));
        PlusDropDown.click();
        WebElement Checkbox1 = driver.findElement(By.xpath("//*[@id=\"c_bf_1\"]"));
        Checkbox1.click();
        WebElement Checkbox2 = driver.findElement(By.xpath("//*[@id=\"c_bf_2\"]"));
        Checkbox2.click();












    }


}

