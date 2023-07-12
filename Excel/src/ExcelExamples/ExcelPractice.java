package ExcelExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExcelPractice {

	static File file= new File("C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Desktop\\prashanth\\Excel\\appfiles2\\Book1.xlsx");
//	static File fs= new File("C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Desktop\\prashanth\\selenium\\src\\utils\\mycontactexcel.java");
	static WebDriver driver;
//	static String appurl = "https://www.mycontactform.com/";
	
	public static void main(String[] args) throws IOException {
		
		
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
		
	
	
	}
	}
