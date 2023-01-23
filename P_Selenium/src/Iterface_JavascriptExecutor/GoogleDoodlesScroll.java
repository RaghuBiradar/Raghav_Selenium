package Iterface_JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDoodlesScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.google.com/doodles");

		JavascriptExecutor  js= (JavascriptExecutor) driver;
		for( ; ;)
		{
			try
			{
				driver.findElement(By.xpath("//a[text()='2022 World Cup - Opening Day!']")).click();
				break;
			}
			catch(Exception e)
			{
				js.executeScript("window.scrollBy(0,200)");

			}
			
		}
		System.out.println(driver.getTitle());
		//driver.quit();

	}

}
