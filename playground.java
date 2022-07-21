package week2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class playground {

	
			//we have to call wdm for the browser driver
			WebDriverManager.chromedriver().setup();
			//launch the browser
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//navigate to website url
			driver.get("https://www.zoomcar.com/in/bangalore");
			
			//maximize
			driver.manage().window().maximize();
	}

}
