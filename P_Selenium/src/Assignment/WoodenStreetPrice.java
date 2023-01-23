package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.html5.RemoveLocalStorageItem;

public class WoodenStreetPrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//step-1 //open the wooden street page
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(10000);
		//close the popup page
		driver.findElement(By.xpath("//div[@id='loginclose1']")).click();
		Thread.sleep(3000);
		//step-2//open the study table section
		driver.findElement(By.xpath("//p[text()='Study Tables']")).click();
		Thread.sleep(5000);
		//step-3//fetch the cost of 2 product
		String costofProduct = driver.findElement(By.xpath("(//strong[contains(text(),'Rs')])[2]")).getText();
		System.out.println("cost of the product is "+" " + costofProduct);
		costofProduct=costofProduct.replace("Rs","");
		costofProduct=costofProduct.replace(",","");
		costofProduct=costofProduct.trim();
		
	//step4&5  check the cost is greater then 10000 if not display error 
        int cost=Integer.parseInt(costofProduct);
        if(cost>10000)
        {
        	System.out.println("the cost is too high");
        }
        else
        {
        	driver.findElement(By.xpath("(//div[contains(@id,'article')])[2]")).click();
        	String parentwindowID = driver.getWindowHandle();
        	Set<String> allwindowsID = driver.getWindowHandles();
        	allwindowsID.remove(parentwindowID);
        	for(String windowID:allwindowsID)
        	{
        		driver.switchTo().window(windowID);
        		
        	}
        	Thread.sleep(3000);
        	driver.findElement(By.id("button-cart-buy-now")).click();
        }
		
		
		
	}

}
