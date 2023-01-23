package workingWithTEstNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UseOfDataProvider {

	@DataProvider(parallel = true)
	public String[] websites() {
		String a[]= {"https://in.puma.com/in/en","https://www.reebok.com/us","https://www.woodlandworldwide.com/","https://www.bata.in/"};
		return a;
		
	}
	
	
	
	@Test(dataProvider = "websites")
	public  void test(String url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(url);
		System.out.println(" displyed");
		//driver.quit();
	}

}
