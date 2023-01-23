package Assignment;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViaCalenderHandelling {

	public static void main(String[] args) {
		LocalDateTime systemsDateTime = LocalDateTime.now().plusMonths(1);
		String monthName = systemsDateTime.getMonth().name();
		int year = systemsDateTime.getYear();
		int day = systemsDateTime.getDayOfMonth();
		String month = ""+ monthName.charAt(0)+monthName.substring(1,monthName.length()).toLowerCase();
		System.out.println(month);

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://in.via.com/");
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.id("departure")).click();

//		for(;;) {
//			try {
			driver.findElement(By.xpath("//span[contains(text(),' \" + year + \"')]/../..//div[text()='\" + day + \"']")).click();
//				break;
//			}
//			catch(Exception e) {
//				driver.findElement(By.xpath("//span[contains(@class,'vc-month-control-active js-next-month')]")).click();
//			}
//		}

	}

}
