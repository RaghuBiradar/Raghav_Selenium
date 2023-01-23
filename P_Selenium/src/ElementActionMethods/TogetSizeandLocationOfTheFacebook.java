package ElementActionMethods;

import javax.swing.tree.FixedHeightLayoutCache;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetSizeandLocationOfTheFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		WebElement emailTextfield = driver.findElement(By.id("email"));
		WebElement passwordTextfield = driver.findElement(By.id("passContainer"));

		Dimension sizeofElement = emailTextfield.getSize();
		System.out.println(sizeofElement);
		int widthofEmailelement = sizeofElement.getWidth();
		int heigtofTheEmailelement = sizeofElement.getHeight();
		System.out.println("The width of the email"+ " " +widthofEmailelement);
		System.out.println("The width of the email" +" " + heigtofTheEmailelement);


		Dimension sizeofElement1 = passwordTextfield.getSize();
		System.out.println(sizeofElement1);
		int widthofPASSelement = sizeofElement1.getWidth();
		int heigtofThePASSelement = sizeofElement1.getHeight();
		System.out.println("The width of the Password" +" " + widthofPASSelement);
		System.out.println("The height of the Password" +" "+ heigtofThePASSelement);

		if(widthofEmailelement==widthofPASSelement)
		{
			System.out.println("Both email and password sizes are same");
		}
		else
		{
			System.out.println("Email and password sizes are different");
		}
		Point locationOfTheEmail = emailTextfield.getLocation();
		int emailTextfieldXLocation = locationOfTheEmail.getX();
		int emailTextfieldYLocation = locationOfTheEmail.getY();
		System.out.println(emailTextfieldXLocation);
		System.out.println(emailTextfieldYLocation);

		Point locationOfThePass = passwordTextfield.getLocation();
		int passTextfieldXLocation = locationOfThePass.getX();
		int passTextfieldYLocation = locationOfThePass.getY();
		System.out.println(passTextfieldXLocation);
		System.out.println(passTextfieldYLocation);






	}
}
