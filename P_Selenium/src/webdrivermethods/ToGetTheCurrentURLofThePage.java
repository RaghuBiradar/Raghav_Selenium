package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheCurrentURLofThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
	}

}
