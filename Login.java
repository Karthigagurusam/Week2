package week2;

import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://leaftaps.com/opentaps");
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// close Browser
		// driver.close();
		
		// find the username and enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		// Find password and enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click login button
		driver.findElement(By.className("decorativesubmit")).click();
		
		// To check we are in correct page
		WebElement logout = driver.findElement(By.className("decorativesubmit"));
		String attribute = logout.getAttribute("value");
		if (attribute.equals("Logout"))
			System.out.println("successfully logged In");
	}
}
