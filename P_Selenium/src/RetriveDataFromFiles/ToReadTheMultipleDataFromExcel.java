package RetriveDataFromFiles;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadTheMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(new File("./testResources/File_1.xlsx"));
		Workbook wb= WorkbookFactory.create(fis);
		
		Sheet infosheet = wb.getSheet("Sheet1");
		int rowcount = infosheet.getPhysicalNumberOfRows();
		int colcount = infosheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] arr= new String[rowcount][colcount];
		for(int i=0; i<rowcount;i++)
		{
			for(int j=0; j<colcount;j++) {
				
				arr[i][j]= infosheet.getRow(i).getCell(j).toString();
				
			}
		}
		for(String[] array:arr) {
			for(String data : array)
			{
				System.out.print(data + ",");
			}
			System.out.println();
		}

	}

}
