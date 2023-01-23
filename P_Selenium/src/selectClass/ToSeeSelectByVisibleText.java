package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSeeSelectByVisibleText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement choose = driver.findElement(By.xpath("//span[text()='EN']/.."));
		//choose.click();
		Select Lng= new Select(choose);
		System.out.println(Lng.isMultiple());
		List<WebElement> NoLng = Lng.getOptions();
		for(WebElement data : NoLng) {
			System.out.println(data.getText());
			//Lng.selectByVisibleText(data.getText());
		
		}
	   Lng.selectByValue(null)

	}
}

