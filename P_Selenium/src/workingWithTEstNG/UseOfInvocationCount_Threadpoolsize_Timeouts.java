package workingWithTEstNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseOfInvocationCount_Threadpoolsize_Timeouts {

	
		@Test(invocationCount = 6,threadPoolSize = 2,invocationTimeOut = 10000)
		public void usernametextbox() {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver sp=new ChromeDriver();
			sp.manage().window().maximize();
			sp.get("https://www.ferrari.com/en-IN");
			//sp.quit();
			
		}
		
		// 

	}


