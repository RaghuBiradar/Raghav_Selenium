package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToAnApplication {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		     
		     ChromeDriver driver=new ChromeDriver();
		     driver.get("https://www.lenskart.com/");
		    
		     driver.get("https://www.linkedin.com/");
		     
	}

}
