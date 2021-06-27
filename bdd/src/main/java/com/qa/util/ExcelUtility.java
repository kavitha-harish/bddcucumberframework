package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public String getExcelData(String sheetname, int rownum, int cellnum) throws Throwable {
FileInputStream file=new FileInputStream(IpathConstant.EXCELFILE_PATH);
Workbook workbook=WorkbookFactory.create(file);
Sheet sheet = workbook.getSheet(sheetname);
Row row = sheet.getRow(rownum);
Cell cell = row.getCell(cellnum);
String value = cell.getStringCellValue();
return value;
}

}
