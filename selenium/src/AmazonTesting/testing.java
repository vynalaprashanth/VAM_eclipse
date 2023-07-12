package AmazonTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {
	static String appurl=("https://www.amazon.in/");
	static String country="https://www.amazon.in/customer-preferences/country?ref_=icp_lop_mop_chg&preferencesReturnUrl=/";
	
	
	public static void main(String[] args) throws InterruptedException {
	
		
		

		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();
	
		
		//1
				driver.get(appurl);
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				//2
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(" ");
				driver.findElement(By.id("nav-search-submit-button"));
				
				
				//3
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("s");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				
				//4
				
				
				//5
				
				
				driver.findElement(By.id("searchDropdownBox")).click();
		        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select/option[3]")).click();
		    
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("s");
				Thread.sleep(1000);
			  List<WebElement> hits = driver.findElements(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[2]/div"));
			     hits.get(2).click();
				
				
				//6
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sa");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				
				//7
				for(int i=0; i<=3; i++)
				{
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sa");
				
				}
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				//9
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("s");
			       Select select = new Select(driver.findElement(By.name("")));
					
					select.selectByIndex(1);
					Thread.sleep(3000);
					
					List<WebElement> list = select.getOptions();
					int listcount = list.size();
					System.out.println(listcount);
					
					
					
					for(int i=0;i<listcount;i++) {
						
						WebElement element = list.get(i);
						
						
						System.out.println(((WebElement) select).getText());
					}
				
			//  9)    Enter a long string under 650 characters, it should load the result page.
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
			        driver.findElement(By.id("twotabsearchtextbox")).clear(); 
				
				//10
				
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tyre size 150 70 17");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				//12
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("10mmDrivers");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				
				//14
				driver.findElement(By.id("searchDropdownBox")).click();
		        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select/option[3]")).click();
		        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("s");
		        Thread.sleep(1000);
		        List<WebElement> lis = driver.findElements(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[2]/div"));
		        lis.get(3).click();
				
				
				
				
//	           15 Department
	            Select sel = new Select(driver.findElement(By.id("searchDropdownBox")));
	            sel.selectByVisibleText("Amazon Pharmacy");
	            @SuppressWarnings({ "unlikely-arg-type", "unused" })
	            boolean check7 = sel.equals("Amazon Pharmacy");
	            if(check7 = true)
	            {
	                System.out.println("Test for Department is pass");
	            }
	            else {
	                System.out.println("fail");
	            }
	            driver.findElement(By.id("twotabsearchtextbox")).clear();
	            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dolo-650");
	            WebElement submit = driver.findElement(By.id("nav-search-submit-button"));
	            submit.click();
	            @SuppressWarnings("unused")
	            boolean ch1 = driver.findElement(By.partialLinkText("Dolo-650")) != null;
	            if(ch1= true)
	            {
	            System.out.println("pass");
	            }
	            else
	            {
	                System.out.println("fail");
	            }



	           
               //different department
	            
	            Select sel1 = new Select(driver.findElement(By.id("searchDropdownBox")));
	            sel1.selectByVisibleText("Amazon Fresh");
	            submit = driver.findElement(By.id("nav-search-submit-button"));
	            submit.click();
	            
	            driver.findElement(By.id("twotabsearchtextbox")).clear();
				
				
				
				
				
				
				
				
				//16copy
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one");
				String abc = driver.findElement(By.id("twotabsearchtextbox")).getText();
				
				
				//17past
				String bca="one";
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one");
				String one = driver.findElement(By.id("twotabsearchtextbox")).getText();

				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(one+"plus");
				
				
				//18
				
				
				
				//19 different account
				driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
				driver.findElement(By.id("ap_email")).sendKeys("9603048773");
				driver.findElement(By.id("continue")).click();
				driver.findElement(By.id("ap_password")).sendKeys("Hemu@90599");
				driver.findElement(By.id("signInSubmit")).click();
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				
				
				//20 different windows
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
				driver.findElement(By.id("nav-search-submit-button")).click();
				driver.switchTo().newWindow(WindowType.TAB);
				driver.navigate().to(appurl);
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				
				
				//22
				driver.get(country);
		        Thread.sleep(2000);        
		        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/span/span/span/span")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.linkText("United States")).click();
		        driver.findElement(By.className("a-button-input")).click();
		        driver.getTitle();
				
				

				//33
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
				driver.wait();
				driver.navigate().refresh();
				driver.wait();
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				
		Thread.sleep(10000);
		driver.quit();
		
			
	}

}
