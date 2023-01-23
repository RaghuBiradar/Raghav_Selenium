package workingWithTEstNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	

	@Parameters("BrowserName")
	@Test
	public void Yamaha(@Optional("edge") String R1) {
		WebDriver driver = null;
		if (R1.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		else if (R1.equalsIgnoreCase("edge")) {

			 System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		     
			 driver =new EdgeDriver();
		}
		
//		else if (R1.equalsIgnoreCase("edge")) {
//
//			 System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
//		     
//			 driver =new EdgeDriver();
//		}
		

//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.yamaha-motor-india.com/");
		System.out.println("Hero displyed");
		driver.quit();
	}

}
