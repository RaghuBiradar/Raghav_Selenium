package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class A_5_TitleOfMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/Sony/Downloads/MultipleWindow.html");
	driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
	Thread.sleep(3000);

	Set<String> allwindowsTitle = driver.getWindowHandles();
	for(String window : allwindowsTitle)
	{
		driver.switchTo().window(window);
		String title=driver.getTitle();
		System.out.println(title);
	}
	

	}

}
