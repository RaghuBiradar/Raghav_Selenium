package POM_Topic.HRX_Scripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase_001 extends HRXHomePage {

	public void Test_1(){
	assertEquals(featureName, ExpectedFeatureName,"shoes name mismatched");
	System.out.println("the name shoes is displayed");
	WebElement sportsShoes = driver.findElement(By.xpath("(//img[contains(@class,'responsive')])[3]"));
	Thread.sleep(3000);
	sportsShoes.click();
	Thread.sleep(3000);
	
	hrx.getSportsShoes().click();
}
}