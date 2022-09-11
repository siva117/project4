package basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelUtil {

	public static void main(String[] args) throws IOException {
		     WebDriverManager.chromedriver().setup();
		
		     InputStream xfile =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Datafiles\\EmpManagement.xlsx");
		     XSSFWorkbook wb= new XSSFWorkbook(xfile);
		     XSSFSheet  sheet =wb.getSheet("createEmp") ; 
		     XSSFRow    row =sheet.getRow(1);
		     
		     if(row!=null) {
		    	XSSFCell  cell = row.getCell(3);
		     
		      String value;
		     if(cell!=null) {
		    
		    	value= cell.toString();//it ll take the value and give as string
		     }else {
		    	 value="";
		     }
		      System.out.println(value);
		     }
	
		     wb.close();
		     }}
     