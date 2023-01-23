package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateInTheApplication {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		System.out.println("hi");
		Thread.sleep(3000);
		driver.get("https://www.hotstar.com/in");
		Thread.sleep(3000);
		Navigation navigate = driver.navigate();
          navigate.back();
          Thread.sleep(3000);
          navigate.forward();
          Thread.sleep(3000);
          navigate.refresh();
          Thread.sleep(3000);
          URL url = new URL("https://www.zee5.com");
          navigate.to(url);
	}

}
