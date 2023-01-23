package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSiurceCodeofThePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		String sourcecodeofpage = driver.getPageSource();
		System.out.println(sourcecodeofpage);

				

	}

}
