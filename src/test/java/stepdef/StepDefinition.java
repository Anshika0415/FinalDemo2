package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class StepDefinition {
	WebDriver driver;
	LoginPage lp;
@Before
public void setup(Scenario scenario)
{
	//this piece of code will run before every scenario
	driver=new ChromeDriver();
	lp=new LoginPage(driver);
	
}

@After
public void tearDown()
{
	driver.quit();
	
}

@Given("agent enters {string} and {string}")
public void agent_enters_and(String string, String string2) {
    lp.agentEntersDetails();
}
@When("agent clicks on submit button")
public void agent_clicks_on_submit_button() {
   
}
@Then("agent should be able to login")
public void agent_should_be_able_to_login() {
  
}


}
