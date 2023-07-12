package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonTest {
	
	static WebDriver driver;
	static String appurl = "https://www.amazon.in/";
	static String country="https://www.amazon.in/customer-preferences/country?ref_=icp_lop_mop_chg&preferencesReturnUrl=/";
	static WebElement sub;
		
	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		sub = driver.findElement(By.id("nav-search-submit-button"));
	
		
		driver.findElement( By.id("twotabsearchtextbox")).sendKeys("iphone");
		sub.click();
		//@SuppressWarnings("unused")
		boolean check = driver.findElement(By.partialLinkText("iphone")).isEnabled();
		if(check= true)
		{
		System.out.println("Test for valid product name is pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		

	}

}

