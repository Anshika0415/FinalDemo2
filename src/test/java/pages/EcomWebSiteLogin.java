package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonutils.CommonUtils;
import io.cucumber.java.Scenario;

public class EcomWebSiteLogin {
	WebDriver driver;
	CommonUtils cu;
	Scenario scenario;

	public EcomWebSiteLogin(WebDriver driver, CommonUtils cu, Scenario scenario) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.cu=cu;
		this.scenario=scenario;
	}

	public void enterEcomPage() {
		// TODO Auto-generated method stub
		WebElement PracticeDD=driver.findElement(By.xpath("//a[@class='dynamic-link dropdown-toggle']"));
    	cu.click(PracticeDD);
    	String parentWindow=driver.getWindowHandle();
    	WebElement EcomPractice=driver.findElement(By.xpath("//a[text()='eCommerce Practice']"));
    	cu.click(EcomPractice);
    	Set<String> set=driver.getWindowHandles();
    	for(String window:set)
    	{
    		if(!window.equalsIgnoreCase(parentWindow))
    		{
    			driver.switchTo().window(window);
    		}
    	}
		
	}

}
