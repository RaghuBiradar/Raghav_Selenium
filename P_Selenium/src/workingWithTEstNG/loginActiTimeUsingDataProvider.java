package workingWithTEstNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginActiTimeUsingDataProvider {

	@DataProvider
	public String[][] Credential() {
		String a[][]= {{"admin","manager"},{"trainee","trainee"}};
		return a;
		
	}
	
	
	
	@Test(dataProvider = "Credential")
	public  void test(String[] url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(url[0]);
		driver.findElement(By.name("pwd")).sendKeys(url[1]);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		
		//driver.quit();
	}
}
