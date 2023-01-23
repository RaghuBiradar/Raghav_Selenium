package HardAndSoftAsserts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertUsage {
	
	String expectedLoginpage="actiTIME - Login";
	String actualusername="admin";
	String actualpassword="manager";
	@Test
	public void actitimeLogin() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 driver.get("https://demo.actitime.com/login.do");
		 String actualLoginPageTitle = driver.getTitle();
		 assertEquals(actualLoginPageTitle, expectedLoginpage, "login page is not displayed");
		 
		 WebElement username = driver.findElement(By.id("username"));
		 username.clear();
		 username.sendKeys(actualusername);
		 Assert.assertEquals(username.getAttribute("value"), actualusername, "user name is not entered properly");
		 
		 WebElement password = driver.findElement(By.name("pwd"));
		 password.clear();
		 password.sendKeys(actualpassword);
		 Assert.assertEquals(password.getAttribute("value"), actualpassword, "password  is not entered properly");
		 
		 driver.findElement(By.id("loginButton")).click();
		 
		 
		 
		
	}

}
