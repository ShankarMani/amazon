package generic;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL {
	public static String getcellValue(String path ,String sheet,int r,int c ) {
		String v="";
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}catch(Exception e) {}
		return v;
	}



	public static int getLastRowCount(String path,String sheet) {
		int rc=0;
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			rc=wb.getSheet(sheet).getLastRowNum();
		}catch(Exception e) {}
		return rc;
	}
	

}
