package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandTheDifferenceBetweenCloseandQuit {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sony/Downloads/MultipleWindow.html");
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		System.out.println("size of set : " + allWindowIds.size());
		for(String windowId : allWindowIds)
		{
			System.out.println(windowId);
		}
		
		driver.quit();
		
		

	}

}
