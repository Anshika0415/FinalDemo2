package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void agentEntersDetails() {
		// TODO Auto-generated method stub
		String baseURL = "http://www.letskodeit.com/";
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		
	}

}
