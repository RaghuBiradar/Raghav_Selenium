package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyFirefoxBrowser {

	public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		     
		   FirefoxDriver driver=new FirefoxDriver();

	}

}
