package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_011 {

	@Test
	public void RemooveProductFromCart() {not done
		/////////////////////////////// Varify that whether user is able to click on checkout on shopping  cart page

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
		
		base.getMovetheProductToWishlist();
		Reporter.log("The product checked out from the cart", true);
	}
}
