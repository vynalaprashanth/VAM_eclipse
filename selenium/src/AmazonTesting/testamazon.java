package AmazonTesting;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class testamazon {
	
static WebDriver driver;
static String url="https://www.amazon.in/";
static String appurl="https://www.amazon.in/customer-preferences/country?ref_=icp_lop_mop_chg&preferencesReturnUrl=/";
static WebElement prs;
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
        driver.manage().window().maximize();
       prs = driver.findElement(By.id("nav-search-submit-button"));
        prs =        driver.findElement(By.id("nav-search-submit-button"));
  //1st point
   /*    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles");
      driver.findElement(By.id("nav-search-submit-button")).click();      */
  /*     boolean check= driver.findElement(By.partialLinkText("samsung mobiles")).isEnabled();
       if(check= true)
       {
    	   System.out.println("search product passed");
       }else
       {
    	   System.out.println("search product failed");
       }
      
     driver.findElement(By.id("twotabsearchtextbox")).clear();
       
       driver.navigate().back();*/
  //2nd point   
        
     /*   WebElement bar= driver.findElement(By.id("twotabsearchtextbox"));
        if(bar.equals(null)) {*/
        	
 /*      driver.findElement(By.id("twotabsearchtextbox")).clear();
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("s");
     Thread.sleep(3000);
     driver.findElement(By.id("twotabsearchtextbox")).clear();
    
     //3
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i");
     driver.findElement(By.id("nav-search-submit-button")).click();
     driver.findElement(By.id("twotabsearchtextbox")).clear();     */

     
     //4
     
         //5
     
     
 /*    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i");
     Thread.sleep(2000);
    List<WebElement> lst = driver.findElements(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[2]/div"));
        System.out.println(lst.size());
     lst.get(2).click();
     driver.findElement(By.id("twotabsearchtextbox")).clear();
       
     //6 
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pr");
   driver.findElement(By.id("nav-search-submit-button")).click();
   driver.findElement(By.id("twotabsearchtextbox")).clear();
   driver.findElement(By.id("twotabsearchtextbox")).clear();
   
   //7
   for(int i=0;i<=3;i++)
   {
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pr");
   }
   driver.findElement(By.id("nav-search-submit-button")).click();
   driver.findElement(By.id("twotabsearchtextbox")).clear();          */
   
   //8
   
   
   
  //9 A
    
 /*  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("w");
       Select sel= new Select(driver.findElement(By.name("")));
       
       sel.selectByIndex(1);
       driver.findElement(By.id("nav-search-submit-button")).click();
       
       driver.findElement(By.id("twotabsearchtextbox")).clear();*/
       
       
       
      /* List<WebElement> list= sel.getOptions();
       int listcount = list.size();
       System.out.println(listcount);
       
       for(int i=0;i<listcount;i++) {
    	   WebElement select= list.get(i);
    	  
		
		System.out.println(((WebElement)select).getText());
       }
       //9 B
       String a = "Samsung m30";
       int Stringcount = a.length();
       if(Stringcount<=650) {
           driver.findElement(By.id("twotabsearchtextbox")).sendKeys(a);
           driver.findElement(By.id("nav-search-submit-button")).click();
       }
       else
       {
           System.out.println("Error Error");
       }
       driver.findElement(By.id("twotabsearchtextbox")).clear();*/ 
	
	//10
       
       
   
   /*      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("jkajsckjjkdcbdscjbdckjdnuk");
         driver.findElement(By.id("nav-search-submit-button")).click();
         driver.findElement(By.id("twotabsearchtextbox")).clear();
   
   
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Croma 80 cm (32 Inches) HD Ready Certified Android Smart LED TV CREL032HOF024601 (Black) (2022 Model)");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.navigate().back();      */
  
          
   // ///change country 
     
     WebElement element = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]"));
     Actions action = new Actions(driver);
     
     action.moveToElement(element).perform();
     Thread.sleep(3000);
     driver.findElement(By.linkText("Change country/region.")).click();
	 
     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/span/span/span/span"));
     driver.findElement(By.linkText("United States")).click();
     driver.findElement(By.className("a-button-input")).click();
     driver.findElement(By.id("twotabsearchtextbox")).clear();
      driver.navigate().back();           
    
      ///
      
  /*    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tyre size 150 70 17");
      driver.findElement(By.id("nav-search-submit-button")).click();
      driver.findElement(By.id("twotabsearchtextbox")).clear();    */
      // if(ta) {
    	//   System.out.println("True");
       //}else
       //{
    	 //  System.out.println("False");
      // }
      //driver.findElement(By.id("twotabsearchtextbox"));*/

   /* try {
    	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tdjsyrsytsjyrdytd");
       }catch(IOException e){
    	   e.fillInStackTrace();*/
    	   
           //  driver.findElement(By.id("twotabsearchtextbox")).clear();
	  /*  	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("b");
	    	 Thread.sleep(3000);
	    	 List<WebElement> st = driver.findElements(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[2]/div"));
	        
	    	 st.get(2).click();  
	    	 driver.findElement(By.id("twotabsearchtextbox")).clear();    */   

    	 //change of department
	    	
	    	// driver.findElement(By.id("searchDropdownDescription")).click();
            // driver.findElement(By.id("issprefix")).click();
           
           //  driver.findElement(By.className("nav-search-scope nav-sprite")).click();
             driver.findElement(By.id("searchDropdownBox")).click();
             Thread.sleep(3000);
            // driver.findElements(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div")) ;
              driver.findElement(By.linkText("Amazon Pharmacy")).click();
            
            // List<WebElement>hm= 
             //hm.getClass();
               driver.findElement(By.className("twotabsearchtextbox")).sendKeys("Dolo 650");
            // driver.findElement(By.id("searchDropdownDescription")).click();
          
  	
           	driver.close();
    	
       }
      
       
      
    
      
	}

        
	


