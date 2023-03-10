package testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataExcel {
	
	

	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = new FileInputStream(new File("C:\\\\Users\\\\7J5711897\\\\Desktop\\\\TestData.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");  
        for (Row row : sheet) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default:
                        System.out.print("\t");
                }
            }
            System.out.println();
        }

        inputStream.close();
        workbook.close();
	}
	
	
	//method defined for reading a cell  
	public String ReadCellData(int vRow, int vColumn)  
	{  
	String value=null;          //variable for storing the cell value  
	Workbook wb=null;           //initialize Workbook null  
	try  
	{  
	//reading data from a file in the form of bytes  
	FileInputStream fis=new FileInputStream("C:\\Users\\7J5711897\\Desktop\\TestData.xlsx");  
	//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
	wb=new XSSFWorkbook(fis);  
	}  
	catch(FileNotFoundException e)  
	{  
	e.printStackTrace();  
	}  
	catch(IOException e1)  
	{  
	e1.printStackTrace();  
	}  
	Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
	Row row=sheet.getRow(vRow); //returns the logical row  
	Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
	value=cell.getStringCellValue();    //getting cell value  
	return value;               //returns the cell value  
	}  

	}


