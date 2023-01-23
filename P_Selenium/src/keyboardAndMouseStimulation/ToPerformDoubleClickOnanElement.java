package keyboardAndMouseStimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClickOnanElement {   ///// double click functions

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement Taptap = driver.findElement(By.id("add"));/// to increase the number 
		WebElement Taptapback = driver.findElement(By.id("minus"));/// to decrease the number
		 Actions actions = new Actions(driver);
         actions.doubleClick(Taptap).perform();
         actions.doubleClick(Taptapback).perform();

	}

}
