package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class gen_write {

	public  void excel_write(String sh1,String expt,ArrayList<String> al) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(expt);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sh1);
		
		for(int i=0;i<al.size();i++ )
		{
			Row r = sh.createRow(i);
			Cell c = r.createCell(1);
			c.setCellValue(al.get(i));
		}
		FileOutputStream fos=new FileOutputStream(expt);
		wb.write(fos);

    }
}