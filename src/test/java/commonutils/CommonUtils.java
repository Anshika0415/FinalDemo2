package commonutils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtils {
	WebDriver driver;
	
	public CommonUtils(WebDriver driver) {
		this.driver=driver;
	}

	public void click(WebElement elem)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		elem.click();
		
	}

}
