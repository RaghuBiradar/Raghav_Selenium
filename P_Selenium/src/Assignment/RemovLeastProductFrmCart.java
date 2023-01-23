package Assignment;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemovLeastProductFrmCart {
	public static WebDriver driver;
	public static WebDriverWait explictwait;
	public static JavascriptExecutor js;
	public static Map<Integer, String> productDetails;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		explictwait = new WebDriverWait(driver, 15);
		////// step 1- open flipkart application
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[text()='✕']")).click(); /// to remove pop-up page

		// step 2 - search and add 3 different products to cart
		searchAndAddProduct("APPLE");
		searchAndAddProduct("REDMI");
		searchAndAddProduct("realme");

		// step 3 - remove the least product
		driver.findElement(By.linkText("Cart")).click();
		String lowestProduct = "";
		List<WebElement> prices = driver.findElements(By.xpath(""));////////////////////////////////////////////////
		for (int i = 1; i < prices.size(); i++) {
			int price = Integer.parseInt(prices.get(11).getText().replace("", "").replace(", ", ""));

			productDetails.put(price, "Product" + i + "");
		}
		Set<Integer> costsOfProduct = productDetails.keySet();
		for (int lowestCost : costsOfProduct) {
			lowestProduct = productDetails.get(lowestCost);

			break;
		}

		char IndexOfRemoveButton = lowestProduct.charAt(lowestProduct.length() - 1);

		for (;;) {

			try {

				driver.findElement(By.xpath("(//div[text()='Remove'])[" + IndexOfRemoveButton + "]")).click();
				break;

			} catch (ElementClickInterceptedException e) {
				js.executeScript("window.scrollBy(0,250)");
			}
		}
		driver.findElement(By.xpath(""));

	}

	public static void searchAndAddProduct(String productname) throws InterruptedException {
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys(productname, Keys.ENTER);
		explictwait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'" + productname + "')]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'" + productname + "')]")).click();
		String parentwindowId = driver.getWindowHandle();
		Set<String> allwindowsIds = driver.getWindowHandles();
		allwindowsIds.remove(parentwindowId);
		for (String windowid : allwindowsIds) {
			driver.switchTo().window(windowid);
		}
		explictwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		explictwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[.='Place Order']")));
		driver.close();
		driver.switchTo().window(parentwindowId);
		explictwait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER + "a");
		driver.findElement(By.name("q")).sendKeys(Keys.DELETE);

	}

}
