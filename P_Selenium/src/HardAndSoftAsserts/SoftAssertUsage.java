package HardAndSoftAsserts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class SoftAssertUsage {

	String expectedLoginpage="actiTIME - Logi";
	String actualusername="admin";
	String actualpassword="manager";
	
	@Test
	public void actitimeLogin() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 WebDriverWait explicitewait = new WebDriverWait(driver, 15);
		 SoftAssert SA=new SoftAssert();
		 
		 driver.get("https://demo.actitime.com/login.do");
		 String actualLoginPageTitle = driver.getTitle();
		 SA.assertEquals(actualLoginPageTitle, expectedLoginpage, "login page is not displayed");
		 
		 WebElement username = driver.findElement(By.id("username"));
		 username.clear();
		 username.sendKeys(actualusername);
		 SA.assertEquals(username.getAttribute("value"), actualusername, "user name is not entered properly");
		 
		 WebElement password = driver.findElement(By.name("pwd"));
		 password.clear();
		 password.sendKeys(actualpassword);
		 SA.assertEquals(password.getAttribute("value"), actualpassword, "password  is not entered properly");
		 
		 driver.findElement(By.id("loginButton")).click();
		 explicitewait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink"))).click();
		 
		 SA.assertAll();
		 
		 
		 
		
	}

}
