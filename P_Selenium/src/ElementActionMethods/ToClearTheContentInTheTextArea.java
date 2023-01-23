package ElementActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClearElement;

public class ToClearTheContentInTheTextArea {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm");
		Thread.sleep(2000);
		
		WebElement UsernameTextField = driver.findElement(By.xpath("//input[@id='username']"));
		UsernameTextField.clear();
		UsernameTextField.sendKeys("Raghav");
		
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@id='password']"));
		passwordTextField.clear();
		passwordTextField.sendKeys("Rakk");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//button[text()='Sign in']"));
		submit.submit();

	}

}
