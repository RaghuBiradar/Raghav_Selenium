package Iterface_JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDisableTextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement textBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		System.out.println(textBox.isEnabled());
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Raghav';",textBox);
		

	}

}
