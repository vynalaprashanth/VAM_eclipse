package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.dataprovider;

class loginservice {
	
static String[] username= {"prashanth","qatrainer","qatrainer"};
static String[] password= {"12","box","admin123"};
	static WebDriver driver;
	static String appurl = "https://www.mycontactform.com/";
    public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			dataprovider dr=new dataprovider();
			options.addArguments("start-fullscreen");
			driver = new ChromeDriver(options);
			int new1=username.length;
			driver.navigate().to("https://www.mycontactform.com/");
					//for(int i=0;i<new1;i++) {
			//launch browser
		//driver.navigate().to("https://www.google.com/");
		//driver.navigate().refresh();
            
		
            //title
            System.out.println(driver.getTitle());
            
            //url
            System.out.println(dr.getappurl());
            
           /* if(driver.getPageSource).contains("G-mail")) {
            	System.out.println("step verified");
            	
            }else
            {
            	System.out.println("step not verified");
            }*/
            driver.findElement(By.name(dr.getunelement())).sendKeys(dr.getusername());
            driver.findElement(By.name(dr.getpwelement())).sendKeys(dr.getpassword());
            
            WebElement submit = driver.findElement(By.name(dr.getsubmit()));
            
            if(submit.isEnabled()) {
            	submit.click();
            	
            }
            try {
            //	 String usermessage = driver.findElement(By.id(dr.geterror())).getText();
            //	 System.out.println("Login Fail"+"\t"+usermessage);
            }catch(NoSuchElementException e) {
            e.printStackTrace();
            }
            //sign out
            try {
            	WebElement logout = driver.findElement(By.linkText(dr.getlogout()));
            	if(logout.isEnabled()) {
            		logout.click();
            		System.out.println("Login Success");
            	}
            }
            	
            	catch(NoSuchElementException e) {
            		e.printStackTrace();
            		System.out.println(e.getMessage());
            	}
            	//Thread.sleep(3000);
            	
			driver.close();
  
             				
					}
//					driver.close();
    }




				 
		
		



