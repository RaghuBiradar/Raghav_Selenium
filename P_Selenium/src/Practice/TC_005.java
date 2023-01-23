package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_005 {


	/////////////////////////////// Varify that whether user is able to moove the the product from the wishlist to cart

	@Test
	public void moveProductFromWishlistToCart() {

		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://services.smartbear.com/samples/TestComplete14/smartstore/");

		driver.findElement(By.linkText("Soccer")).click();
		driver.findElement(By.linkText("Trainer Ball")).click();
		driver.findElement(By.linkText("Add to List")).click();
		System.out.println("added to wishlist");

		driver.findElement(By.linkText("View Wishlist")).click();

		SmartElemets base = new SmartElemets(driver);
		base.getWishlist().click();
		base.getMoovetheProductTocart().click();
		Reporter.log("The product is mooved from wishlist to cart", true);
	}
}

