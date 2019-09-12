package Com.actiTIME.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String getKeyPropertyValue(String prop_path, String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(prop_path);
		Properties pc=new Properties();
		pc.load(fis);
		String value=pc.getProperty(key);
		return value;
		
		 
	}
	public void setCelldata(String execelPath, String sheet, int row, int cell, Date value) throws Throwable 
	{
		FileInputStream fis =new FileInputStream(execelPath);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(value);
		wb.close();
	}
	
	public String getCelldata(String execelPath, String sheet, int row, int cell) throws Throwable
	{
		
		FileInputStream fis =new FileInputStream(execelPath);
		Workbook wb=WorkbookFactory.create(fis);
		String value=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return value;
		
	}
	public int getRowCount(String execelPath, String sheet) throws Throwable, Throwable
	{
		FileInputStream fis =new FileInputStream(execelPath);
		Workbook wb=WorkbookFactory.create(fis);
		int rc=wb.getSheet(sheet).getLastRowNum();
		return rc;
		
		
		
	}

}
