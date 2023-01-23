package ElementActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheTextOfWebElement {   //to verify that user has given the right input

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		Thread.sleep(2000);
		
		WebElement usernameTextField = driver.findElement(By.id("userName"));
		usernameTextField.sendKeys("Raghav");
		Thread.sleep(2000);
		
		String attributeValue = usernameTextField.getAttribute("value");
		System.out.println(attributeValue);
	}

}
