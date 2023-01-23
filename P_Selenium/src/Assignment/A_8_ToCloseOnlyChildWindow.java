package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;

public class A_8_ToCloseOnlyChildWindow {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/Sony/Downloads/MultipleWindow.html");
			driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
			Thread.sleep(3000);
			
			Set<String> closechildwindow = driver.getWindowHandles();
			for(String id : closechildwindow )
			{
				driver.switchTo().window(id);
				Thread.sleep(3000);
				SessionId close = driver.getSessionId();
				System.out.println(close);
				driver.close();
				
			}
	}

}
