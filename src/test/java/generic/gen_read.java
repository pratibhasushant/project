package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class gen_read 
{
public  ArrayList<String> exel_read(String sh1,String expt) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis=new FileInputStream(expt);
	
    Workbook w = WorkbookFactory.create(fis);
         Sheet sh = w.getSheet(sh1);
         int rn = sh.getLastRowNum();
         
         ArrayList<String> al=new ArrayList<String>();
         for(int i=0;i<=rn;i++)
         {
        	  Row r = sh.getRow(i);
        	    short cn = r.getLastCellNum();
        	    for(int j=0;j<cn;j++)
        	    {
        	        Cell c = r.getCell(j);
        	    
        	        String v = c.toString();
        	        al.add(v);
                    
        	    }
        	    
         }
         return al;
}
}
