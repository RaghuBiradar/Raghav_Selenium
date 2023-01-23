package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromaAddToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//step-1 //open the Croma page
		driver.get("https://www.croma.com/");
		Thread.sleep(10000);

		//step-2//open the mobile section
		driver.findElement(By.xpath("//img[@title='Mobiles']")).click();
		Thread.sleep(5000);

		//step-3//fetch the cost of 2 product
		driver.findElement(By.xpath("(//img[@alt='undefined'])[16]")).click();
		String costofProduct = driver.findElement(By.xpath("(//span[@class='amount'])[1]")).getText();
		System.out.println("cost of the product is "+" " + costofProduct);
		costofProduct=costofProduct.replace("₹","");
		costofProduct=costofProduct.replace(",","");
		costofProduct=costofProduct.trim();
		System.out.println(costofProduct);

		//step4&5  check the cost is greater then 10000 if not display error 
//		int cost=Integer.parseInt(costofProduct);
//		if(cost>10000)
//		{
//			System.out.println("the cost is too high");
//		}
//		else
//		{
			driver.findElement(By.xpath("//a[text()='Redmi A1+ (2GB RAM, 32GB, Black)']")).click();
			
			String parentwindowID = driver.getWindowHandle();
			Set<String> allwindowsID = driver.getWindowHandles();
			allwindowsID.remove(parentwindowID);
			for(String windowID:allwindowsID)
			{
				driver.switchTo().window(windowID);

			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[text()='Extended Warranty']")).sendKeys(args)
			driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Proceed to Cart']")).click();
		}

	}


