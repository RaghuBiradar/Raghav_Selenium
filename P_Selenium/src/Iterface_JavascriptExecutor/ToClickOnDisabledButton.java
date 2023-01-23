package Iterface_JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnDisabledButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase7-archive-downloads.html");
		driver.findElement(By.xpath(" //a[contains(text(),'jdk-7u80-solaris-i586.tar.gz')]")).click();
		
		WebElement disableButtoon = driver.findElement(By.xpath("Download jdk-7u80-solaris-i586.tar.gz"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",disableButtoon);

	}

}
