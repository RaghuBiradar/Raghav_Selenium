package LearnHandlePoP_Ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleConfirmationPop_upOfLIC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explictwait = new WebDriverWait(driver, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://licindia.in/");
		try {
			driver.findElement(By.xpath("//a[@title='Agents Portal']")).click();
		}
		catch(Exception e) {
			js.executeScript("window.scrollBy(0,200);");
			driver.findElement(By.xpath("//a[@title='Agents Portal']")).click();
		}
		
		Alert confirmationAlert = driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());
		confirmationAlert.accept(); ////////////////handled confirmation pop-up
		
		String parentwindowID = driver.getWindowHandle(); ////////////switching to another tab
    	Set<String> allwindowsID = driver.getWindowHandles();
    	allwindowsID.remove(parentwindowID);
    	for(String windowID:allwindowsID) {
    		driver.switchTo().window(windowID);
    	}
		///////////////////// to get the error text from the page
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		WebElement text = driver.findElement(By.xpath("//li"));
		System.out.println(text.getText());
		
		WebElement text1 = driver.findElement(By.xpath("//li[normalize-space()='Please enter your Password']"));
		System.out.println(text1.getText());
		
		
		

	}

}
