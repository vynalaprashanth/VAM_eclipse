package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class mycontactexcel {
	
	static File file= new File("C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Desktop\\prashanth\\Excel\\appfiles2\\Book1.xlsx");
	 

	public mycontactexcel (){
		try {
            FileInputStream fis = new FileInputStream(file);
            
            @SuppressWarnings("resource")
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sh = wb.getSheet("Sheet2");
            int shcount = sh.getPhysicalNumberOfRows();
            System.out.println(shcount);
            
            
            
            for(int i=1;i<shcount;i++) {
            	String uname= sh.getRow(i).getCell(0).getStringCellValue();
            	String pword= sh.getRow(i).getCell(1).getStringCellValue();
            	String result= sh.getRow(i).getCell(2).getStringCellValue();
            	String usermsg= sh.getRow(i).getCell(3).getStringCellValue();
            	System.out.println(uname+"\t"+pword+"\t"+result+"\t"+usermsg);
            	
            	//sh.getRow(i).getCell(2).setCellValue("Success");
            	//sh.getRow(i).getCell(3).setCellValue("Valid");
      
        }
            //FileOutputStream fos= new FileOutputStream(file);
        	//wb.write(fos);
            
           
            
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally {
        	if(file.exists()){
        		System.out.println("Step Verified");
        	}else
        	{
        		System.out.println("Step Not Verified");
        	}
		
	}
	}
	

	}

	


