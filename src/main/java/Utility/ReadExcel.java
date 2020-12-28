package Utility;

import java.io.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	public static String retrieveExcelData(String input) throws IOException
	{
	   File f = new File("./Excel/MyExcel.xlsx");
    FileInputStream fis = new FileInputStream(f);
    Workbook wb = new XSSFWorkbook(fis);
    Sheet sh = wb.getSheet("Sheet1");
 String name=null;

    if(input=="Username")
    {
         name = sh.getRow(0).getCell(1).getStringCellValue();
    }
    else if(input=="Password")
    {
        name = sh.getRow(1).getCell(1).getStringCellValue();
    }
    wb.close();
    return name;
	}
    
}
