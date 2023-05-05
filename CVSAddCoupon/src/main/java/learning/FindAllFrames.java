package learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllFrames {

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		// Calling the Home Page By Using Get() Method
		driver.get(baseUrl);
		
		// Delay 3 seconds
		Thread.sleep(3000);
		
		// Print Message Before button click
		System.out.println("Before Clicking Feedback Button");
		
		//Get list of web-elements with tagName  - iFrame
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		 
		//Traversing through the list and printing its text along with link address
		for(WebElement frames:allFrames){
			System.out.println(frames.getText() + " - " + frames.getAttribute("title"));
			
			
			// Find the Invitation to provide feedback Frame
			String strProvideFeedBck = frames.getAttribute("title");
			if(strProvideFeedBck.contains("Invitation to provide feedback")) {
				
				// Print Message Invitation to provide feedback Frame Open
				System.out.println(frames.getAttribute("id"));
				
				driver.switchTo().frame("kampyleInvite");
				//driver.findElement(By.id("kplDeferButton")).click();
				//driver.findElement(By.id("kplDeclineButton")).click();
				
				driver.findElement(By.xpath(".//*[@id=\"kplDeferButton\"]")).click();
				//driver.findElement(By.xpath(".//*[@id=\"kplDeclineButton\"]")).click();
				
				// Switch Back to Default Browser
				driver.switchTo().defaultContent();
				
				// Print Message Back to Default Browser Window
				System.out.println("Back to Default Browser Window");
			}
		}
		
		// Print Message
		System.out.println("\nAfter Clicking Feedback Button");
		
		// Feedback Button
		WebElement feedbackButton = driver.findElement(By.id("nebula_div_btn"));
		feedbackButton.click();
		
		//Get list of web-elements with tagName  - iFrame
		List<WebElement> alliFrames = driver.findElements(By.tagName("iframe"));
				 
		//Traversing through the list and printing its text along with link address
		for(WebElement iframes:alliFrames){
			System.out.println(iframes.getText() + " - " + iframes.getAttribute("title"));
			System.out.println(iframes.getAttribute("id"));
			System.out.println(iframes.getAttribute("src\n"));
		}
		
		driver.switchTo().frame("kampyleForm9664");
		driver.findElement(By.xpath(".//*[@id=\"liveForm\"]/div/div[1]/div/button")).click();
				
		// Print Message Feedback Button Frame was closed
		System.out.println("Feedback button frame was closed");
		
		// Switch Back to Default Browser
		driver.switchTo().defaultContent();
		
		// Print Message Back to Default Browser Window
		System.out.println("Back to Default Browser Window");
		
		// Print Message Again open the Feedback Button
		System.out.println("Open again Feedback button");
		
		// Click Again Feedback Button
		driver.findElement(By.id("nebula_div_btn")).click();
		
		// Switch to the Feedback frame
		driver.switchTo().frame("kampyleForm9664");

		// Click the Close Button in Feedback Frame
		driver.findElement(By.xpath(".//*[@id=\"liveForm\"]/div/div[2]/neb-form-footer/div/div[1]/div/div/div/div/button[1]")).click();

		// Print Message Close Feedback Button using Close Button
		System.out.println("Close Feedback Button using Close Button");
				
		// Switch Back to Default Browser
		driver.switchTo().defaultContent();
		
		// Print Message Back to Default Browser Window
		System.out.println("Back to Default Browser Window");
		
		// Close Browser
		driver.close();

	}

}
