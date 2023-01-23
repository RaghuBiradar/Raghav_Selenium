package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverControl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://petstore.swagger.io/#");
		
		

	}

}
