package learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllLinks {

	public static void main(String[] args) {
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
		
		//Get list of web-elements with tagName  - a
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 
		 //Traversing through the list and printing its text along with link address
		 for(WebElement link:allLinks){
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
			
		 }
		 
		 // Close Browser
		 //driver.close();
	}

}
