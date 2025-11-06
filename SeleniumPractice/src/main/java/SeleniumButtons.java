import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/buttons");
        driver.manage().window().maximize();

    //finding the position of the button

        WebElement getButtonPosition = driver.findElement(By.id("doubleClickBtn"));
        Point XYpoint = getButtonPosition.getLocation();
        int Xvalue =  XYpoint.getX();
        int Yvalue =  XYpoint.getY();
        System.out.println("The Value of X is:" + Xvalue +" and The value of Y is:"+ Yvalue);

        //To find the colour of the button
        WebElement ButtonColour = driver.findElement(By.id("doubleClickBtn"));
        String Colour = ButtonColour.getCssValue("background-color");
        System.out.println("The Colour of the Button is:" + Colour);

        //To find the size of the button
        WebElement ButtonSize = driver.findElement(By.id("doubleClickBtn"));
        int Height = ButtonSize.getSize().getHeight();
        int Width = ButtonSize.getSize().getWidth();
        System.out.println("The Height of the Button is:" + Height + " and The Width of the Button is:" + Width);

        //To Rightclick the button
        WebElement RightButton = driver.findElement(By.id("rightClickBtn"));
        Actions action = new Actions(driver);
        action.contextClick(RightButton).perform();

        //To DoubleClick the button
        WebElement DoubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        Actions action2 = new Actions(driver);
        action2.contextClick(DoubleClickButton).perform();

    }
}
