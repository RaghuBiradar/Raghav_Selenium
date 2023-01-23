package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowID {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		String titleofthepage = driver.getTitle();
		System.out.println(titleofthepage);
		Set<String> windowID = driver.getWindowHandles();
		System.out.println(windowID);
	
		
				
		 
		
	}
	 
}
