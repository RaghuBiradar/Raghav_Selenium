package webdrivermethods;





import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePositionOfTheBrowserWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		driver.get("https://www.primevideo.com/");
		Thread.sleep(3000);

		Point positionofthebrowser = new Point(100, 50);
		driver.manage().window().setPosition(positionofthebrowser);
		Thread.sleep(3000);

		Dimension sizeofthebrowser =new Dimension(800, 800);
		driver.manage().window().setSize(sizeofthebrowser);

		//driver.manage().window().fullscreen();


	}

}
