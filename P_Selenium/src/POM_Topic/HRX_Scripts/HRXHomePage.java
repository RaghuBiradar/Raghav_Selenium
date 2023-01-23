package POM_Topic.HRX_Scripts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRXHomePage {

	public class HrxComparingModuleName{
		@Test
	public void Name() throws InterruptedException{
	String ExpectedFeatureName="SHOES";
	boolean ExpectedBuyNOwButton=true;
	boolean ExpectedImagesOfShoes=true;
	String ExpectedroductDescriptionText ="PRODUCT DESCRIPTION";
	
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.hrxbrand.com/home"); 
	HrxBasePage hrx=new HrxBasePage(driver);
	hrx.getCollectionElement().click();
	hrx.getFootwear().click();
	String featureName = hrx.getShoes().getText();
	//System.out.println(featureName);
	
	//Test Case-1 ShoesName
	assertEquals(featureName, ExpectedFeatureName,"shoes name mismatched");
	System.out.println("the name shoes is displayed");
	WebElement sportsShoes = driver.findElement(By.xpath("(//img[contains(@class,'responsive')])[3]"));
	Thread.sleep(3000);
	sportsShoes.click();
	Thread.sleep(3000);
	
	hrx.getSportsShoes().click();
	
	
	
	//Test Case-2 BuyNOwButton
	boolean actualBuyNOwButton = hrx.getBuyNow().isDisplayed();
	assertEquals(ExpectedBuyNOwButton, actualBuyNOwButton,"BUY NOW button is not displayed");
	System.out.println("BUY NOW button is displayed");
	
	//Test Case-3 shoesImage
	boolean ActualImagesOfShoes = hrx.getShoesImage().isDisplayed();
	assertEquals( ExpectedImagesOfShoes,ActualImagesOfShoes,"Image of Shoes is not displayed");
	System.out.println("Image of Shoes is displayed");
	
	
	
	//Test case-4 ProductDescriptionName
	String ActualProductText =hrx.getProductDescription().getText();
	assertEquals(ActualProductText, ExpectedroductDescriptionText,"Text is not displayed");
	System.out.println("ProductDescription Text is displayed");
	
	
	//Test Case-5 SpecificationsText
	String ActualspecificationText =hrx.getSpecifications().getText();
	System.out.println("specification Text is displayed");
	//assertEquals(ActualspecificationText, ExpectedP,"Text is not displayed");
	
	
	
	}
}
}
