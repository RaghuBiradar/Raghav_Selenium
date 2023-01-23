package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectFbDOB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement selectDay = driver.findElement(By.id("day"));
		WebElement selectMonth = driver.findElement(By.id("month"));
		WebElement selectYear = driver.findElement(By.id("year"));
		
		Select day=new Select(selectDay);
		System.out.println(day.isMultiple());
	    List<WebElement> NoDays = day.getOptions();
	    for(WebElement ele :NoDays )
	    {
	    	System.out.println(ele.getText());
	    	
	    	
	    }
	    day.selectByVisibleText("23");
	    
	    Select month=new Select(selectMonth);
		System.out.println(month.isMultiple());
	    List<WebElement> NoMonths = month.getOptions();
	    for(WebElement ele :NoMonths )
	    {
	    	System.out.println(ele.getText());
	    	
	    	
	    }
	    month.selectByIndex(3);
	    
	    Select year=new Select(selectYear);
		System.out.println(year.isMultiple());
	    List<WebElement> NoYears = year.getOptions();
	    for(WebElement ele :NoYears )
	    {
	    	System.out.println(ele.getText());
	    	//day.selectByVisibleText(ele.getText());
	    	
	    }
	    year.selectByValue("2001");

	}

}
