package keyboardAndMouseStimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveTheCursorUsingCordinates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		
		WebElement navigationBar = driver.findElement(By.xpath("//div[text()='Cameras']"));
		
		Actions actions = new Actions(driver);
        actions.moveToElement(navigationBar).perform(); /// goes to camera bar
        Thread.sleep(3000);
        actions.moveToElement(navigationBar, -287, 0).perform();// now mooves to home appliances

	}

}
