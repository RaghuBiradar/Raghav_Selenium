package RetriveDataFromFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//step 1 - creating input stream type object
		File abspath = new File("./testResources/File_1.xlsx");
		FileInputStream fis = new FileInputStream(abspath);

		//step 2 - create object of file type
		Workbook workbook = WorkbookFactory.create(fis);


		//step 3 - read methods
		RichTextString value = workbook.getSheet("Sheet1").getRow(3).getCell(3).getRichStringCellValue();


		System.out.println(value);
		
		System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(0).getRichStringCellValue());
	}

}
