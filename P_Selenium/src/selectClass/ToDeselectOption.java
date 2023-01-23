package selectClass;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ToDeselectOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Sony/Downloads/dropDown.html	");
		
		WebElement multiSelectDropdown = driver.findElement(By.id("m1"));
		Select multiselect = new Select(multiSelectDropdown);
		System.out.println("IS the dropdown Multiselect "+ multiselect.isMultiple());
		List<WebElement> allOptions = multiselect.getAllSelectedOptions();
		for (WebElement ele:allOptions) {
			System.out.println(ele.getText()+", ");
			
		}
		System.out.println();
		multiselect.selectByIndex(1);
		multiselect.selectByValue("4");
		System.out.println("Selected Options");
		List<WebElement> selectedOptions = multiselect.getAllSelectedOptions();
		for(WebElement ele:selectedOptions) {
			System.out.println(ele.getText());
			
		}
//		multiselect.deselectByVisibleText("Mango");
//		multiselect.deselectByIndex(3);
		multiselect.deselectAll();
		System.out.println("selected options part2");
		multiselect.selectByVisibleText("Grapes");
		multiselect.selectByValue("1");
		WebElement firstSelectDropdown = multiselect.getFirstSelectedOption();
		System.out.println(firstSelectDropdown.getText());
	}

}
