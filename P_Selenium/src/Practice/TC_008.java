package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_008 {

	@Test
	public void IncreaseProductQTYFromCart() {
		/////////////////////////////// Varify that whether user is able to increase the quantity of the product in the cart

		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://services.smartbear.com/samples/TestComplete14/smartstore/");

		driver.findElement(By.linkText("Soccer")).click();
		driver.findElement(By.linkText("Trainer Ball")).click();
		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("added to cart");

		SmartElemets base = new SmartElemets(driver);
		base.getGotoCart().click();
		base.getIncreaseQtyInCart();
		
		Reporter.log("The product is increased in the cart", true);
	}
}
