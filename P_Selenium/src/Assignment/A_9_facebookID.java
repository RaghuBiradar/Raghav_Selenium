package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;

import webdrivermethods.ToGetTheCurrentURLofThePage;

public class A_9_facebookID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		  SessionId windowID = driver.getSessionId();
		System.out.println("The window ID of current page is "+" " + windowID);
		
	}

}
