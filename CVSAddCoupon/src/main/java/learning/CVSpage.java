package learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;

public class CVSpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// String Where Home Page URL Is Stored
        String baseUrl = "https://www.cvs.com/";

		// Creating New Object driver Of WebDriver for Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;	
        
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		// Calling the Home Page By Using Get() Method
		driver.get(baseUrl);
		
		//Get Title Message
		String chromeMsg = driver.getTitle();
		//Confirming Message
		System.out.println("Chrome Browser is opened\n" + chromeMsg);
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
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
				
				// Click Close Button
				driver.findElement(By.xpath(".//*[@id=\"kplDeferButton\"]")).click();
				//driver.findElement(By.xpath(".//*[@id=\"kplDeclineButton\"]")).click();
				
				// Switch Back to Default Browser
				driver.switchTo().defaultContent();
				
				// Print Message Back to Default Browser Window
				System.out.println("Back to Default Browser Window");
			}
		}
		
		
		
        
        try {
        	
        	// Find WebElement for Sin in
    		WebElement signin = (WebElement)js.executeScript("return document.querySelector(\"body > app-root > app-homepage > cvs-header-component > div > cvs-header > cvs-header-desktop\").shadowRoot.querySelector(\"#cvs-desktop-header-container > div.header-desktop-bottom.sc-cvs-header-desktop > div:nth-child(1) > cvs-header-utility-bar\").shadowRoot.querySelector(\"#cvs-header-util-link > a\")");
    		
    		
    		//Perform Click on LOGIN button using JavascriptExecutor
            js.executeScript("arguments[0].click();", signin);
            
            String strCurrentURL = driver.getCurrentUrl();
    		System.out.println(strCurrentURL);
		
        
        } catch(Exception e){ System.out.println(e); }

		
		String strCurrentTitle = driver.getTitle();
		System.out.println(strCurrentTitle);
		
		
		
		//driver.findElement(By.id("cvs-header-util-link")).click();
		//WebElement sigInPage = driver.findElement(By.id("cvs-header-util-link"));
		//sigInPage.click();
		
		
		
		//driver.findElement(By.id("email")).clear();
		//driver.findElement(By.id("email")).sendKeys("kamalakannan.anandan@gmail.com");
		
		
		//driver.findElement(By.name("email")).clear();// Good practice to clear a field before use
		//driver.findElement(By.name("email")).sendKeys("mngr309297");
		
/*		
		// Creating New Webdriver for Safari Browser
        WebDriverManager.safaridriver().setup();
		WebDriver idriver = new SafariDriver();
		
		// Maximize the browser
		idriver.manage().window().maximize();
		
		// Implicitly Wait
		idriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		// Calling the Home Page By Using Get() Method
		idriver.get(baseUrl);
		
		//Get Title Message
		String sfrMsg = idriver.getTitle();
		//Confirming Message
		System.out.println("Safari Browser is opened " + sfrMsg);
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		//Close browser
		idriver.close();
		
*/
		
	
/*		
		//Open in Firefox Driver
		WebDriverManager.firefoxdriver().setup();
		WebDriver fdriver = new FirefoxDriver();
		fdriver.manage().window().maximize();
		fdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fdriver.get(baseUrl);
		
		//Get Title Message
		String frfxMsg = fdriver.getTitle();
		//Confirming Message
		System.out.println("Firefox Web Browser is opened " +frfxMsg);
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		//Open in Microsoft Edge Driver
		WebDriverManager.edgedriver().setup();
		WebDriver edriver = new EdgeDriver();
		edriver.manage().window().maximize();
		edriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		edriver.get(baseUrl);
		
		//Confirming Message
		String edgeMsg = edriver.getTitle();
		//Confirming Message
		System.out.println("Microsoft Edge Web Browser is opened " +edgeMsg);
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		
*/
		
		
/*		
		//Open in Microsoft Edge Driver
		WebDriverManager.
		WebDriver edriver = new EdgeDriver();
		edriver.manage().window().maximize();
		edriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		edriver.get(baseUrl);
		
		//Confirming Message
		String edgeMsg = edriver.getTitle();
		//Confirming Message
		System.out.println("Microsoft Edge Web Browser is opened " +edgeMsg);
		
		// Wait for 3 seconds
		Thread.sleep(3000);
	
*/
		
		
		//Close browser
		//driver.close();
		//fdriver.close();
		//edriver.close();
		
		
	}

}
