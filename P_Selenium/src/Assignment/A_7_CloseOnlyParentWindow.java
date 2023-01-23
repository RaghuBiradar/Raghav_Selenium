package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_7_CloseOnlyParentWindow {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/Sony/Downloads/MultipleWindow.html");
			driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
			Thread.sleep(3000);
		
		driver.close();

	}

}
