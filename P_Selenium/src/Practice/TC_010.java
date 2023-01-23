package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_010 {

	@Test
	public void RemooveProductFromCart() {  not done
		/////////////////////////////// Varify that whether user is able to remove the product from the cart

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
		
		base.getRemoveProductFromCart();
		Reporter.log("The product is removedrom the cart", true);
	}
}
