package Assignment;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IxigoCalenderHandleling {

	public static void main(String[] args) {
		
		LocalDateTime systemsDateTime = LocalDateTime.now();
		String monthName = systemsDateTime.getMonth().name();
		int year = systemsDateTime.getYear();
		int day = systemsDateTime.getDayOfMonth();
		String month = ""+ monthName.charAt(0)+monthName.substring(1,monthName.length()).toLowerCase();

		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.ixigo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
		
//		for(;;) {
//			   try {
				   driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//div[text()='"+day+"']")).click();
//				   break;
//			   }
//			   catch(Exception e) {
//				   driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
//			   }
//		}
		
		
	}

}
