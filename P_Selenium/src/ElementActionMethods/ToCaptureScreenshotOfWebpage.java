package ElementActionMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureScreenshotOfWebpage {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
        Thread .sleep(5000);
        
       File tempSSS = driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chFlights active']")).getScreenshotAs(OutputType.FILE);
       Thread .sleep(5000);
       TakesScreenshot ts=  (TakesScreenshot) driver;
		File tempSS = ts.getScreenshotAs(OutputType.FILE);
		File targetSS = new File("./errorshots/snap.png");
		FileHandler.copy(tempSSS, targetSS);
		
		
	}

}
