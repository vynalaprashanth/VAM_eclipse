import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginDataExcel2 {

	static File file= new File("C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Desktop\\prashanth\\ExcelExample\\appfiles2\\Book1.xlsx");
	
	
	public static void main(String[] args) {
		try {
            FileInputStream fis = new FileInputStream(file);
            
            @SuppressWarnings("resource")
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sh = wb.getSheet("Sheet1");
            int count = sh.getPhysicalNumberOfRows();
            System.out.println(count);
            
            
        }catch(IOException e)
        {
            e.printStackTrace();
        }
		
	}

}

	}

}
