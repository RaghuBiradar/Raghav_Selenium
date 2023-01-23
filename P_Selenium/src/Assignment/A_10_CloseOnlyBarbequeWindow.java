package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_10_CloseOnlyBarbequeWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/Sony/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		Set<String> ids = driver.getWindowHandles();
		for(String id:ids)
		{
			String title=driver.switchTo().window(id).getTitle();
			if(title.contains("Barbeque"))
			{
				driver.close();
		}
		}		
}}


