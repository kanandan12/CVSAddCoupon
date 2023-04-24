package learning;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CVSpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// String Where Home Page URL Is Stored
        String baseUrl = "https://www.cvs.com/";
	
		// Creating New Object driver Of Webdriver for Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		// Calling the Home Page By Using Get() Method
		driver.get(baseUrl);
		
		//Get Title Message
		String chromeMsg = driver.getTitle();
		//Confirming Message
		System.out.println("Chrome Web Browser is opened " + chromeMsg);
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		
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
		driver.close();
		//fdriver.close();
		//edriver.close();
		
		
	}

}
