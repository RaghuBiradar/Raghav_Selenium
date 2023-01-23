package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		Thread.sleep(10000);
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("regEmail")).sendKeys("8088207998");
		

	}

}
