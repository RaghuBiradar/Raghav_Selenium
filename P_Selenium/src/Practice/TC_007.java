package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_007 {

	@Test
	public void DecreaseProductQTYFromWishlist() {
		/////////////////////////////// Varify that whether user is able to decrease the quantity of the product in the wishlist

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
		base.getIncreaseQtyInWishlist();
		base.getDecreaseQtyInWishlist().click();
		Reporter.log("The product is increased in the  wishlist", true);
	}
}

