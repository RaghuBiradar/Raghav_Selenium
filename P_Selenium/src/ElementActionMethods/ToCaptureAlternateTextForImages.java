package ElementActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAlternateTextForImages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(10000);

		driver.findElement(By.id("loginclose1")).click();
		
		String alternateText = driver.findElement(By.xpath("//img[@title='Sofa set online']")).getAttribute("alt");

		System.out.println(alternateText);
		Thread.sleep(5000);
	}

}
