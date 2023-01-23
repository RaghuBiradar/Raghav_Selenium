package workingWithTEstNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class usingDataFromExcelByDataProviderForActiTime {

	@DataProvider
	public String[][] Credential() throws EncryptedDocumentException, IOException {
		
		File abspath = new File("./testResources/Nagu.xlsx");
		FileInputStream fis = new FileInputStream(abspath);

		//step 2 - create object of file type
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet datasheet = workbook.getSheet("Sheet1");
		
		int rowCount = datasheet.getPhysicalNumberOfRows() - 1;
		int collCount = datasheet.getRow(0).getPhysicalNumberOfCells();

		String data[][] = new String[rowCount][collCount];
		for (int i = 1, k = 0; i <= rowCount; i++,k++) {
			for (int j = 0; j < collCount; j++) {
				data[k][j] = datasheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
			
	
	
	
	@Test(dataProvider = "Credential")
	public  void test(String[] url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(url[0]);
		driver.findElement(By.name("pwd")).sendKeys(url[1]);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		
		//driver.quit();
	}
}
