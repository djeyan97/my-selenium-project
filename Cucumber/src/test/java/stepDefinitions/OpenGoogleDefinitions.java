package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleDefinitions {

    WebDriver driver;

    @Given("the user opens the google homepage")
    public void the_user_opens_the_google_homepage() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }

    @When("user enter {string} into the search box")
    public void user_enter_into_the_search_box(String string) {
        driver.findElement(By.name())

    }

    @And("clicks the search button")
    public void clicks_the_search_button() {

    }
    @Then("User should see results related to {string}")
    public void user_should_see_results_related_to(String string) {

    }

}
