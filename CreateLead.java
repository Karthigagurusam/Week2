package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call the Webdriver Manager
		WebDriverManager.chromedriver().setup();
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the browser
				driver.manage().window().maximize();	
				
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
			driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
				
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthiga");
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gurusamy");

				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("karthiga");
				
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
				
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Test Engineer");

				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gkarthigaguru@gmail.com");
				
				WebElement dropDown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select select = new Select(dropDown1);
				
				select.selectByVisibleText("NewYork");
				
				driver.findElement(By.className("smallSubmit")).click();
				
				String title = driver.getTitle();
				
				System.out.println(title);
	}
}


