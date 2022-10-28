package stepDefination;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	public WebDriver driver;


	@Given("^Intialize the web driver$")
    public void intialize_the_web_driver() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudesh\\OneDrive\\Desktop\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        
    }

    @When("^user navaigates to website \"([^\"]*)\"$")
    public void user_navaigates_to_website_something(String strArg1) {
     driver.get(strArg1);
    }
    
    

    @And("^enter (.+) and (.+) and click on login button$")
    public void enter_and_and_click_on_login_button(String username, String password) {
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }
    
    
    @Then("^user should be able to login sucessfully$")
    public void user_should_be_able_to_login_sucessfully() {
    	System.out.println("hello");
    	driver.quit();
    }

   


  
 
	    
	
	}
	
	
	

