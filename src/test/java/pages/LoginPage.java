package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonutils.CommonUtils;
import io.cucumber.java.Scenario;

public class LoginPage {
WebDriver driver;
CommonUtils cu;
Scenario scenario;

	public LoginPage(WebDriver driver, CommonUtils cu, Scenario scenario) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.cu=cu;
		this.scenario=scenario;
	}

	public void agentEntersDetails(String name, String pass) {
		// TODO Auto-generated method stub
		String baseURL = "http://www.letskodeit.com/";
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		WebElement signIn=driver.findElement(By.xpath("//a[text()='Sign In']"));
		cu.click(signIn);
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		emailField.sendKeys(name);
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='login-password']"));
		passwordField.sendKeys(pass);
		WebElement loginBtn=driver.findElement(By.id("login"));
    	cu.click(loginBtn);
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.invisibilityOf(loginBtn));
	}

	public void practicePageTasks() {
		WebElement PracticeDD=driver.findElement(By.xpath("//a[@class='dynamic-link dropdown-toggle']"));
    	cu.click(PracticeDD);
	}

}
