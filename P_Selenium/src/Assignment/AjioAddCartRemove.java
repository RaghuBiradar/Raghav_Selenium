package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class AjioAddCartRemove {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//step 1 - open the ajio browser
		driver.get("https://www.ajio.com/");
		//step -2 open and search for the product
		driver.findElement(By.name("searchVal")).sendKeys("jackets",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"products\"]/div[3]/div[1]/div/div[1]")).click();
		//if new tab opens to handle or moove the control over new tab we write this
		String parentwindowID = driver.getWindowHandle();
		Set<String> allwindowsID = driver.getWindowHandles();
		allwindowsID.remove(parentwindowID);
		for(String windowID:allwindowsID)
		{
			driver.switchTo().window(windowID);

		}
		//step-3 fetch the cost of the product
		String jacketcost = driver.findElement(By.xpath("//div[@class='prod-sp']")).getText();
		System.out.println(jacketcost);
		jacketcost=jacketcost.replace("₹", "");
		jacketcost=jacketcost.replace(",", "");
		jacketcost=jacketcost.trim();
		System.out.println(jacketcost);
		//step-3  check the cost of the product
		int cost = Integer.parseInt(jacketcost);
		if(cost>5000)
		{
			System.out.println("too costly");
		}
		else
		{
			driver.findElement(By.xpath("//span[text()='M']")).click();
			driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
			System.out.println("the product is added to the cart");
			//step-4 remove the product from cart
			driver.findElement(By.xpath("//div[text()='PROCEED TO ']")).click();

			driver.findElement(By.xpath("//div[text()='Delete']")).click();
			driver.findElement(By.xpath("//div[text()='DELETE']")).click();
			System.out.println("the product is successfully remooved from the cart");

		}


	}

}
