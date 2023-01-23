package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDoActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
	
		
		driver.findElement(By.id("username")).sendKeys("raghav");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("Raghav@10");
		Thread.sleep(3000);

	}

}
