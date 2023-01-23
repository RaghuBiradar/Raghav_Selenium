package POM_Topic;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchBusForDifferentLocationVia {

	@Test
	public void searchBusForThreeDifferentFromAndToLocations() throws InterruptedException {

		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://in.via.com/"); 
		WebDriverWait expliciteWait=new WebDriverWait(driver, 15);
		WebElement popUp = expliciteWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'No thanks!')]"))));
		popUp.click();
		
		BasePage basePage = new BasePage(driver);
		basePage.getBusNavBarIcon().click();

		BusHomePage busHomePage= new BusHomePage(driver);
		busHomePage.getFromTextField().sendKeys("Bangalore");
		busHomePage.getBangaloreSearchSuggestion().click();

		busHomePage.getToTextField().sendKeys("Goa");
		busHomePage.getGoaSearchSuggestion().click(); 
		busHomePage.getDepartureField().click();
		driver.findElement(By.xpath("//span[contains(text(),'Jan')]/../../..//div[text()='26']")).click();
		busHomePage.getSearchBusesButton().click();
			
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		busHomePage.getFromTextField().clear();
		busHomePage.getFromTextField().sendKeys("Chennai"); 
		busHomePage.getChennaiSearchSuggestion().click();
		busHomePage.getToTextField().clear();
		busHomePage.getToTextField().sendKeys("Hyderabad");
		busHomePage.getHyderabadSearchSuggestion().click();
		busHomePage.getDepartureField().click();
		driver.findElement(By.xpath("//span[.='Jan 2023']/../..//div[text()='28']")).click();
		busHomePage.getSearchBusesButton().click();
		driver.quit();
}
}
