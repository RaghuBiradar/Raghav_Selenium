package Assignment;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_3_ResizeTheWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		driver.get("https://www.primevideo.com/");
		Thread.sleep(3000);
		//driver.manage().window().maximize();
		
		 Dimension resizethewindow = new Dimension(100, 200);
		driver.manage().window().setSize(resizethewindow);
	}

}
