package learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CVSpage {

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
		
		//Get Title Message
		String chromeMsg = driver.getTitle();
		//Confirming Message
		System.out.println("Chrome Browser is opened " + chromeMsg);
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		int size = driver.findElements(By.tagName("iframe")).size();
		String s=Integer.toString(size);
		System.out.println("Frame Size: " +size );
		
		
		
		//if (s.contains("4"))
		//{
			// Switch to first frame
			driver.switchTo().frame("3");
			//kampyleInvite
			
			// Click First Frame Button page
			WebElement feedBackFrame = driver.findElement(By.id("kplDeferButton"));
			String strFeedBack = driver.findElement(By.id("kplDeferButton")).getText();
			System.out.println(strFeedBack);
			driver.findElement(By.id("kplDeferButton")).click();
			//feedBackFrame.click();
			driver.switchTo().defaultContent();
		//}
		
		
		
		
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
