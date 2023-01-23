package Assignment;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_2_NavigateZomatoToSwiggy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.zomato.com");
		System.out.println("zomato");
		Thread.sleep(3000);
		driver.get("https://www.swiggy.com");
		System.out.println("swiggy");

		Navigation navigate = driver.navigate();

		navigate.forward();
		Thread.sleep(3000);

		navigate.back();   
		Thread.sleep(3000);
		
		navigate.refresh();

	}

}
