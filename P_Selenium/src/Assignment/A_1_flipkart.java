package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class A_1_flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String sourceofpage = driver.getPageSource();
		System.out.println(sourceofpage);
		
	}

}
