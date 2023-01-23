package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterByUsingCSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.cssSelector("[class='text-box single-line']")).sendKeys("Raghav");
		driver.findElement(By.cssSelector("[data-val-required='Last name is required.']")).sendKeys("Biradar");
		driver.findElement(By.cssSelector("[data-val-email='Wrong email']")).sendKeys("raghavbiradar14@gmail.com");
		driver.findElement(By.cssSelector("[data-val-length='The password should have at least 6 characters.']")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("[data-val-equalto='The password and confirmation password do not match.']")).sendKeys("Password@123");

		Thread.sleep(3000);

	}

}
