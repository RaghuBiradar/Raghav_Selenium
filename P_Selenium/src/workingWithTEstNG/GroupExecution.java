package workingWithTEstNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupExecution {

	@Test(groups = "smoke", dependsOnGroups = "regg")
	public void Yamaha() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.yamaha-motor-india.com/");
		System.out.println("Hero displyed");
		driver.quit();
			
	}
	
	 @Test(groups = "regg",dependsOnGroups = "acc")
		public void Maruti() {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
			driver.get("https://www.tatamotors.com/");
			System.out.println("TATA displyed");
	        driver.quit();
		}
	 @Test(groups = "acc")
		public void Maruti1() {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
			driver.get("https://www.ferrari.com/en-IN");
			System.out.println("Ferrari displyed");
	        driver.quit();
		}
}
