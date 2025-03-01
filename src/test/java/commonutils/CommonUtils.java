package commonutils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	WebDriver driver;
	
	public CommonUtils(WebDriver driver) {
		this.driver=driver;
	}

	public void click(WebElement elem)
	{
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(elem));
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elem);
            elem.click();
        } catch (Exception e) {
            System.out.println("Error clicking element: " + e.getMessage());
        }
		
	}
	
	public void takeScreenshot(String screenshotName) {
	    try {
	        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        screenshotName = screenshotName.replace(" ", "_");
	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        String directoryPath = System.getProperty("user.dir") + "/reports/screenshots/";
	        
	        // Ensure directory exists
	        File screenshotDir = new File(directoryPath);
	        if (!screenshotDir.exists()) {
	            screenshotDir.mkdirs();
	        }

	        File destFile = new File(directoryPath + screenshotName + "_" + timestamp + ".png");
	        FileUtils.copyFile(srcFile, destFile);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}


}
