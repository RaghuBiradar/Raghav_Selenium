package Iterface_JavascriptExecutor;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingScrollBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		driver.findElement(By.linkText("Patna"));
		js.executeScript("Window.srcollBy(0,200)");
		System.out.println("done");

	}

}
