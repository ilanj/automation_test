package basics;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class RnW {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
		File f=new File("./data.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet s=w.getSheet("Sheet1");
		int i,j;
		for(i=0;i<s.getRows();i++)
		{
			System.out.println(s.getCell(0,i).getContents());
		}
		 WritableWorkbook copy=Workbook.createWorkbook(new File("./data.xls"),w);
		 WritableSheet sheet = copy.getSheet(0); 
		 
		 
		for(i=0;i<s.getRows();i++)
		{
			
			Label l=new Label(1,i,"passed");
			sheet.addCell(l);
		}


	}

}
