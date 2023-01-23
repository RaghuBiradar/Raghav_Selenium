package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcaseTask_2 {

	public static void main(String[] args) throws InterruptedException {
		//Test Data
		String FullName="Raghavendra Biradar";
		String MobileNo="8088207998";
		String UserName="raghav_biradar";
		String PASSWORD="raghav@10";

		//1.Open the browser and enter test url
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Chrome Browser is opened");
		driver.manage().window().maximize();
		System.out.println("chrome browser is maximized");
		driver.get("https://www.instagram.com/");
		System.out.println("click on lSignup LINK");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign up")).click();

		//2.Enter Valid credentials into EmailorPhone number text box
		Thread.sleep(1000);
		WebElement Phone = driver.findElement(By.name("emailOrPhone"));
		Phone.sendKeys(MobileNo);
		Thread.sleep(1000);
		String  ExpectedPhoneNo= Phone.getAttribute("value");
		System.out.println(ExpectedPhoneNo);
		if(ExpectedPhoneNo.equals(MobileNo)) {
			System.out.println("Succesfully entered the Phone number text field");
		}
		else {
			System.out.println("Phone number not entered successfully");
		}

		//3.Enter Valid credentials into Fullname number text box
		WebElement Actualfullname = driver.findElement(By.name("fullName"));
		Actualfullname.sendKeys(FullName);
		Thread.sleep(2000);
		String ExpectedFullName = Actualfullname.getAttribute("value");
		System.out.println(ExpectedFullName);
		if(ExpectedFullName.equals(FullName)) {
			System.out.println("Succesfully entered the full name text field");
		}
		else {
			System.out.println("Full name not entered successfully");
		}


		//4.Enter Valid credentials into Username  text box
		WebElement User = driver.findElement(By.name("username"));
		User.sendKeys(UserName);
		Thread.sleep(2000);
		String ExpectedUsereName = User.getAttribute("value");
		System.out.println(ExpectedUsereName);
		if(ExpectedUsereName.equals(UserName)) {
			System.out.println("Succesfully entered the User name text field");
		}
		else {
			System.out.println("User name not entered successfully");
		}

		//5.Enter Valid credentials into Password text box
		WebElement ActualPassword = driver.findElement(By.name("password"));
		ActualPassword.sendKeys(PASSWORD);
		Thread.sleep(2000);
		String Expectedpassword = ActualPassword.getAttribute("value");
		System.out.println(Expectedpassword);
		if(Expectedpassword.equals(PASSWORD)) {
			System.out.println("Succesfully entered the Password text field");
		}
		else {
			System.out.println("Paassword text field not entered successfully");
		}


		//6.Click on Signup
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Succusfully signed");

		//7.Click on login link
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		System.out.println("Login page displayed succesfully");

		//8.Enter the valid credentials in login page
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys(UserName);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(1000);
		System.out.println("Succusfully logged");



		Thread.sleep(5000);
		driver.quit();

	}

}
