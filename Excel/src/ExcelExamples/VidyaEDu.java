package ExcelExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VidyaEDu {

	 static String url = "https://www.eduvidya.com/";
	 static File file= new File("C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Desktop\\prashanth\\Excel\\appfiles2\\EduVidya.xlsx");
	 static WebDriver driver;
		
	
	public static void main(String[] args) {
	
		
		

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.navigate().to("https://www.eduvidya.com/");
		driver.manage().window().maximize();
		
		
      
		try {
			
			FileInputStream fi = new FileInputStream(file);
	        
			  @SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fi);
		        XSSFSheet s = wb.getSheetAt(0);
		    
		        driver.findElement(By.xpath("//a[@href='/Schools-in-India.aspx']")).click();
		        driver.findElement(By.xpath("//select[@id='ddl_Category']")).click();
		        driver.findElement(By.xpath("//option[@value='1']")).click();
		        driver.findElement(By.xpath("//select[@id='ddl_City']")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//select//option[text()='Pune']")).click();
		        driver.findElement(By.xpath("//input[@type='submit']")).click();
		        
		        try {
		        	String vd= driver.findElement(By.xpath("//strong[text()='Top 5 CBSE Schools in Pune:-']\r\n")).getText();
		        	
		      if(driver.getPageSource().contains(vd)) {
		    	  String ss= driver.findElement(By.xpath("//strong[text()='Top 5 CBSE Schools in Pune:-']\r\n")).getText();
		    	  s.getRow(1).getCell(0).setCellValue(ss);
		    	  
		      } 
		    	  
		    	  
		      
		    	
		    	  
		    	
		        	
		      
		    
		        }catch(NoSuchElementException e) {
		        	
		        	 System.out.println("system failed");
		             driver.findElement(By.xpath("//*[text()='CBSE Schools in Pune']")).click();
		             
		             String college = driver.findElement(By.xpath("//*[text()='Top 5 CBSE Schools in Pune:-']")).getText();
		            
		             s.createRow(0).createCell(0).setCellValue(college);
		             String C1= driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/div[2]/div[5]/div[1]/div[4]/a/u/strong")).getText();
		           
		             s.createRow(1).createCell(0).setCellValue(C1);
		             String C2= driver.findElement(By.xpath("//u//strong[text()='DAV Public School, Pune']")).getText();
		             s.createRow(2).createCell(0).setCellValue(C2);
		             String C3= driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/div[2]/div[5]/div[1]/div[6]")).getText();
		             s.createRow(3).createCell(0).setCellValue(C3);
		             String C4= driver.findElement(By.xpath("//u//strong[text()='Army Public School, Kirkee, Pune']")).getText();
		             s.createRow(4).createCell(0).setCellValue(C4);
		             String C5= driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/div[2]/div[5]/div[1]/div[8]")).getText();
		             s.createRow(5).createCell(0).setCellValue(C5);
		              
		             driver.navigate().back();
		             
		           driver.findElement(By.xpath("//a[@href='https://www.eduvidya.com/CBSE-Schools-in-India']")).click();
		             
		            String Cab=  driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/div[2]/div[5]/div[2]/a/u/strong\r\n")).getText();
		             
		            s.createRow(8).createCell(3).setCellValue(Cab);
		            
		            
		             
		             
		             
		             System.out.println(college);
		           /*  System.out.println(C1);		             
		             System.out.println(C3);
		             System.out.println(C4);
		             System.out.println(C5);
		             System.out.println(Cab);
		             */
		             
		             
		             
		             
		            
		        	
		        }
		        
		       
		        
		        
				
		        FileOutputStream fop= new FileOutputStream(file);
		         wb.write(fop);
		         Thread.sleep(2000);
		         driver.findElement(By.xpath("//a[@href='/Schools-in-India.aspx']")).click();
		         
			
		}catch(Exception e) {
			e.printStackTrace();
		}driver.close();
	
	}
		
	}

//strong[text()='Top 5 CBSE Schools in Pune:-']
//*[@id="content"]/div[1]/div[1]/div[2]/div[5]/div[2]/a/u/strong




