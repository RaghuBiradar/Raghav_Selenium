package keyboardAndMouseStimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropAndGetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Accepted Elements")).click();

		WebElement frame2 = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/droppable/accepted-elements.html']"));
		driver.switchTo().frame(frame2);
		Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement destination = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, destination).perform();
		String text = driver.findElement(By.id("droppable")).getText();
		System.out.println(text);




	}

}
