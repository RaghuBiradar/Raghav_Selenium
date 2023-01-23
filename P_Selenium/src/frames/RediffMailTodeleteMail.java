package frames;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffMailTodeleteMail {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");


		driver.findElement(By.xpath("//a[text()='Sign in']")).click();

		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");

		driver.findElement(By.id("password")).sendKeys("Testing@123");

		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.xpath("//li[@title='Compose a new mail']")).click();

		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Thor-The Bijli Ka Bill",Keys.TAB);

		WebElement bodyFrame = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(bodyFrame);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hi, its THOR, please pay your bills");

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Send']")).click();
		driver.navigate().refresh();
	
		try {
			driver.findElement(By.xpath("//span[text()='Thor-The Bijli Ka Bill']/..//cite")).click();		
		}
		catch(Exception e) {
			
		}
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='Thor-The Bijli Ka Bill']/..//cite")).click();		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[contains(text(),'1 mail deleted')]"))));
		
		TakesScreenshot ss= (TakesScreenshot) driver;
		File temp = ss.getScreenshotAs(OutputType.FILE);
		File am=new File("./errorshots/delete.png");
		FileHandler.copy(temp, am);
		
		
		
		
	}

}
