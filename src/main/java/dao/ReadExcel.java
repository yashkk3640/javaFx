package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	private static Sheet sheet;
	public static Sheet init(){
		try {
		FileInputStream fis = new FileInputStream("src/main/java/resources/excel.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
			return workbook.getSheetAt(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		}
		return null;
	}
	
	public static boolean checkLogin(String id,String pass) {
		init();
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			if (row.getCell(0).getStringCellValue().equals(id) && row.getCell(1).getStringCellValue().equals(pass))
				return true;
		}
		return false;
	}
//	public static void main(String[] args) throws IOException {
//		readExcelFormula();
//	}
}
