package SeleniumPactice4RandomPractice1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test006Readexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream s = new FileInputStream( new File("twstdata.xlsx"));
		
		Workbook workbook = WorkbookFactory.create(s);
		
		Sheet sheet = workbook.getSheet("sheet1");
		
		for(Row row : sheet)
		{
			for(Cell cell : row)
			{
				switch(cell.getCellType())
				{
				case STRING:
					
					System.out.println(cell.getStringCellValue());
					
					break;
					
			    case NUMERIC:
                    System.out.print(cell.getNumericCellValue() + "\t");
                    break;
                case BOOLEAN:
                    System.out.print(cell.getBooleanCellValue() + "\t");
                    break;
                default:
                    System.out.print("Unknown Cell Type\t");
				}
				
			}
		}
	}

}
