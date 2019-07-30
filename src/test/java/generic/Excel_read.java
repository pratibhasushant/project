package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel_read implements Frame_const
{
	public static String readCellValue(String str,int row,int cell)
	{
		String st="";
		try
		{
			FileInputStream fis=new FileInputStream(EXCEL_PATH);
			Workbook wb=WorkbookFactory.create(fis);
			Cell c = wb.getSheet(str).getRow(row).getCell(cell);
			st=c.toString();
		}
		catch(Exception e)
		{
			Reporter.log("path is not valid",true);
		}
		return st;
		
	}

}
