package basics;


import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEmptyEdgeBrowsers {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
     
     EdgeDriver driver=new EdgeDriver();
     
	}

}
