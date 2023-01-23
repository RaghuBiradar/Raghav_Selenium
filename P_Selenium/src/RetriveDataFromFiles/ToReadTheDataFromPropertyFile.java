package RetriveDataFromFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadTheDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//Step1: Creating Input type Object
		File absPath= new File("./testResources/Config.properties");
		FileInputStream fis=new FileInputStream(absPath);
		//FileReader fr=new FileReader(absPath);

		//Step2: Creating object of file type
		Properties properties=new Properties();
		properties.load(fis);

		//Step3:Read Methods:
		String key = properties.get("ChromeBrowserkey").toString();	
		String value = properties.get("ChromeDriverPath").toString();
		String url = properties.get("url").toString();
		String loginbutton = properties.get("LoginButton").toString();
		String userEleId = properties.get("uEelementId").toString();
		String pssEleId = properties.get("pElementId").toString();
		String UsN = properties.get("UserName").toString();
		String Psw = properties.get("Password").toString();
		String loginXpath = properties.get("LgButtonXpath").toString();
		System.setProperty(key,value);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id(loginbutton)).click();
		driver.findElement(By.id(userEleId)).sendKeys(UsN);
		driver.findElement(By.id(pssEleId)).sendKeys(Psw);
		driver.findElement(By.xpath(loginXpath)).click();






	}



}


