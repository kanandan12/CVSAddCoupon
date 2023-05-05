package learning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FeedBackLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// String Where Home Page URL Is Stored
        String baseUrl = "https://www.cvs.com/";
	
		// Creating New Object driver Of WebDriver for Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		// Calling the Home Page By Using Get() Method
		driver.get(baseUrl);
		
		//Get Title Message
		String chromeMsg = driver.getTitle();
		
		//Confirming Message
		System.out.println("Chrome Browser is opened " + chromeMsg);
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		driver.findElement(By.id("nebula_div_btn")).click();
		
		try {
			
			// Switch to Feedback Frame
			driver.switchTo().frame("kampyleForm9664");
			
			// Click X Button to Close
			driver.findElement(By.xpath(".//*[@id=\"liveForm\"]/div/div[1]/div/button")).click();
			
			// Click the Close Button in Feedback Frame
			//driver.findElement(By.xpath(".//*[@id=\"liveForm\"]/div/div[2]/neb-form-footer/div/div[1]/div/div/div/div/button[1]")).click();
	
			// Print Message Feedback Button Frame was closed
			System.out.println("Feedback button frame was closed");
			
			// Back to Default Browser
			driver.switchTo().defaultContent();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		//Close Browser
		//driver.close();

	}

}
