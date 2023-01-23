package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KFCaddToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		//step-1 //open the KFC page
		driver.get("https://online.kfc.co.in/");
		Thread.sleep(10000);

		//step-2//open the Lunch section section
		driver.findElement(By.xpath("//section[text()='NEW LAUNCH']")).click();
		Thread.sleep(5000);

		//step-3//Open the first meal and fetch the cost of that product
		driver.findElement(By.xpath("(//div[@class='medium-menu-product-card'])[15]")).click();
		String costofProduct = driver.findElement(By.xpath("(//div[@class='medium-menu-product-price'])[15]")).getText();
		System.out.println("cost of the product is "+" " + costofProduct);
		costofProduct=costofProduct.replace("₹","");
		System.out.println(costofProduct);
		//step4&5  check the cost is greater then 1000 if not display error 
        double cost= Double.parseDouble(costofProduct);
        if(cost>1000)
        {
        	System.out.println("the cost is too high");
        }
        else
        {
        	
         driver.findElement(By.xpath("(//button[@class='button activeBtn redButton medium-menu-cart-button '])[15]")).click();
         Thread.sleep(5000);

         driver.findElement(By.id("DispositionModuleFormSubmit")).click();
         driver.findElement(By.xpath("//a[@class='delivery-location-link']")).click();
         driver.findElement(By.xpath("//button[text()='Confirm']")).click();
         
        	
        	
        }
		
	}

}
