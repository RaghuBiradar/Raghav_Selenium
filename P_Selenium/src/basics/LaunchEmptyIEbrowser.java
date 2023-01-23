package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyIEbrowser {

	public static void main(String[] args) {

	     System.setProperty("webdriver.IE.driver", "./Drivers/IEriver.exe");
	     
	     ChromeDriver driver=new ChromeDriver();
	     
	}

}
