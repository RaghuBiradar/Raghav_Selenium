package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TofindGoogleMaPinTheChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@data-ogsr-fb='true']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("app");
		driver.findElement(By.xpath("//span[@style='background-position: 0 -1587px;']")).click();
		
		System.out.println("The map is successfully opened");
	}

}
