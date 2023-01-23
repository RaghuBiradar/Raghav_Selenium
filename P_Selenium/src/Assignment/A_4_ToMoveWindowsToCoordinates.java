package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_4_ToMoveWindowsToCoordinates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		Thread.sleep(3000);
		
		Point movethewindow = new Point(100, 50);
		driver.manage().window().setPosition(movethewindow);

	}

}
