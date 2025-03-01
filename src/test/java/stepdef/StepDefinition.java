package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonutils.CommonUtils;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class StepDefinition {
	WebDriver driver;
	LoginPage lp;
	CommonUtils cu;
	
@Before
public void setup(Scenario scenario)
{
	//this piece of code will run before every scenario
	driver=new ChromeDriver();
    cu=new CommonUtils(driver);
	lp=new LoginPage(driver,cu,scenario);
	
}

@After
public void tearDown()
{
	driver.quit();
	
}

@BeforeStep
public void stepWiseSS(Scenario scenario)
{
	cu.takeScreenshot(scenario.getName());
	}

@Given("agent enters {string} and {string} and logins")
public void agent_enters_and(String name, String pass) {
    lp.agentEntersDetails(name,pass);
}

@Then("agent performs tasks on practice page")
public void agent_performs_tasks_on_practice_page() {
    lp.practicePageTasks();
}


}
