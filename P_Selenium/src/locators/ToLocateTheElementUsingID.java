package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateTheElementUsingID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement loginlink = driver.findElementByLinkText("Log in");
		loginlink.click();
		driver.findElement(By.id("Email")).sendKeys("raghav");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("Raghav@10");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("?")).click();
	}

}
