package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://trello.com/login");
		//driver.findElement(By.xpath("(//button[text()='Sign up - it’s free!'])[1]")).click();
		driver.findElement(By.name("user")).sendKeys("raghavbiradar14@gmail.com");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Raghav@10");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("(//div[text()='Elf-43'])[1]")).click();
		
		WebElement source1 = driver.findElement(By.xpath("//span[text()='MockScheduled']"));
		WebElement target1 = driver.findElement(By.xpath("//textarea[text()='Java']"));
		
		WebElement source2 = driver.findElement(By.xpath("//span[text()='MockCompleted']"));
		WebElement target2 = driver.findElement(By.xpath("//textarea[text()='Manual']"));
		
		WebElement source3 = driver.findElement(By.xpath("//span[text()='MockPending']"));
		WebElement target3 = driver.findElement(By.xpath("//textarea[text()='Selenium']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source1, target1).perform();
		actions.dragAndDrop(source2, target2).perform();
		actions.dragAndDrop(source3, target3).perform();
	}

}
