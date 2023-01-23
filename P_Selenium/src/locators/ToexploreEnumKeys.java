package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToexploreEnumKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("userLoginId")).sendKeys("Raghav",Keys.CONTROL+"a");
		Thread.sleep(3000);
		driver.findElement(By.name("userLoginId")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("password")).sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(3000);
	}
	

}
