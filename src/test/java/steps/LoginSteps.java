package steps;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps {
	
	private WebDriver driver;
    @Given("Browser is open")
    public void browserIsOpen() {
       
    System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe"); // Replace with your path
   // Initialize WebDriver
    driver = new ChromeDriver();
    	    
    	    
    }

    @And("user is on login page")
    public void userIsOnLoginPage() {
    	driver.get("https://practicetestautomation.com/practice-test-login/"); //open the Test Page
    }

    @When("^user enter (.*) and (.*)$")
    public void userEnterUsernameAndPassword(String username,String password) throws InterruptedException {
    	driver.findElement(By.xpath("(//span[text()='open menu']/following::input)[1]")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
    }
    
    @And("user click on the login button")
    public void userClickOnTheLoginButton() {
    driver.findElement(By.id("submit")).click();
    }

    @Then("user is navigated to the main page")
    public void userIsNavigatedToTheMainPage() throws InterruptedException {
    driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
    Thread.sleep(2000);
    driver.close();
    driver.quit();
    }
    

}
