package LearnHandlePoP_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlellingPop_up {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Task 1 - To upload file avoiding pop-up
		//		driver.get("https://www.naukri.com/");
		//		driver.findElement(By.linkText("Register")).click();
		//		driver.findElement(By.id("resumeUpload")).sendKeys("C:/Users/Sony/Desktop/Scrum certificate_Udemy.pdf");

		//Task 2 - 
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Sony\\Desktop\\20200908_182415.jpg");
		Alert popupAlert = driver.switchTo().alert();
		System.out.println(popupAlert.getText());

	}

}
