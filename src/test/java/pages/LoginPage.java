package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonutils.CommonUtils;

public class LoginPage {
WebDriver driver;
CommonUtils cu;
	public LoginPage(WebDriver driver, CommonUtils cu) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.cu=cu;
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
		WebElement PracticeDD=driver.findElement(By.xpath("//a[@class='dynamic-link dropdown-toggle']"));
    	cu.click(PracticeDD);
	}

}
