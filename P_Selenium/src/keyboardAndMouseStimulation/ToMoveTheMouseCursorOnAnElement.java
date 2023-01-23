package keyboardAndMouseStimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveTheMouseCursorOnAnElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.kalkifashion.com/");
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		
		WebElement kidsNavBarElement = driver.findElement(By.linkText("KIDS"));
		
		Actions actions = new Actions(driver);
        actions.moveToElement(kidsNavBarElement).perform();
	}

}
