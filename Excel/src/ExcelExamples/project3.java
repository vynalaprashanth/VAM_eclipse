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


public class project3 {

	static File file= new File("C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Desktop\\prashanth\\Excel\\appfiles2\\Book4.xlsx");
	static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.navigate().to("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='https://www.mycontactform.com/signup.php']")).click();
		  FileInputStream fis = new FileInputStream(file);
          
          XSSFWorkbook wb = new XSSFWorkbook(fis);
          XSSFSheet sh = wb.getSheet("Sheet1");
          int shcount = sh.getPhysicalNumberOfRows();
          System.out.println(shcount);
		
		
		try {
            
            
            
            for(int i=1;i<shcount;i++) {
            String Name= sh.getRow(i).getCell(0).getStringCellValue();
        	String Email= sh.getRow(i).getCell(1).getStringCellValue();
        	String user= sh.getRow(i).getCell(2).getStringCellValue();
        	String Pword= sh.getRow(i).getCell(3).getStringCellValue();
        	String Rpword= sh.getRow(i).getCell(4).getStringCellValue();
        //	String Result= sh.getRow(i).getCell(4).getStringCellValue();
        	
       // 	System.out.println(Name+"\t"+Email);
        	
      
        	driver.findElement(By.xpath("//input[@name='name']")).sendKeys(Name);
        	
          	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
         
        	driver.findElement(By.xpath("//input[@name='user_signup']")).sendKeys(user);
           	driver.findElement(By.xpath("//input[@name='pass_signup']")).sendKeys(Pword);
        	driver.findElement(By.xpath("//input[@name='pass2']")).sendKeys(Rpword);
        	driver.findElement(By.xpath("//input[@name='useragree']")).click();;
        	driver.findElement(By.xpath("//input[@name='Submit']")).click();
        	
        	//driver.findElement(By.xpath("//ul//li[text()]"));
            
            
         
          
            	
          try {
        	  WebElement error= driver.findElement(By.xpath("//span[text()='ERROR']"));
        	  if(error.isDisplayed())
        	  {
        		  sh.getRow(i).createCell(4).setCellValue("invalid");
        		  String msg= driver.findElement(By.xpath("//ul//li[text()]")).getText();
        		  sh.getRow(i).createCell(5).setCellValue(msg);
        		
        	  }
          }catch(NoSuchElementException b)
          {
        	  b.printStackTrace();
          }
          try {
        	  WebElement pass= driver.findElement(By.xpath("//div[@id='success_status']"));
        	  if(pass.isDisplayed())
        	  {
        		  sh.getRow(i).createCell(4).setCellValue("valid");
       		  String msg= driver.findElement(By.xpath("//div[@id='success_status']/text()[1]")).getText();
        		  sh.getRow(i).createCell(5).setCellValue("pass");
        	  }
        	  
          }
           catch(NoSuchElementException e)
          {
//        	  sh.getRow(i).createCell(4).setCellValue("valid");
//        	  .getText();
//        	  sh.getRow(i).createCell(5).setCellValue(mmg);
        	  e.printStackTrace();
          }
         FileOutputStream fop= new FileOutputStream(file);
         wb.write(fop);
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[@href='https://www.mycontactform.com/signup.php']")).click();
         
	}
		}catch(IOException e)
        {
            e.printStackTrace();
        }
		  driver.close();
	         driver.quit();
}
	
}
