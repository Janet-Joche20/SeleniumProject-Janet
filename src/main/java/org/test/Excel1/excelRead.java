package org.test.Excel1;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelRead {
	
	public static void main(String[] args) throws Exception {
		
		
		File excelLoc = new File("C:\\Users\\Jeni\\eclipse-workspace\\Excel1\\excel\\Book1.xlsx");
	
		//File->Object format
		FileInputStream stream = new FileInputStream(excelLoc);
		
		//create workbook
		Workbook w = new XSSFWorkbook(stream);
		
		//create sheet
		Sheet s = w.getSheet("Sheet1");
		
		
		
for(int i=0;i<s.getPhysicalNumberOfRows();i++)
{		
	Row r = s.getRow(i);				
	for(int j =0;j<r.getPhysicalNumberOfCells();j++)
	{
		Cell c = r.getCell(j);
		int val = c.getCellType();
			if(val==0)//0-number & date
			{
				if(DateUtil.isCellDateFormatted(c))
						{
						Date d = c.getDateCellValue();
						SimpleDateFormat fr = new SimpleDateFormat("dd-mmm-yy");
						String date = fr.format(d);
						System.out.println(date);
						}
				else
				{							
					double num = c.getNumericCellValue();
					long l =(long) num;
					System.out.println(l);
				}
			}
			else
			{
				System.out.println(c);
			}
	}
}		
	
}
}
