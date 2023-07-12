package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumexample {
	static String[] url= {"https://www.amazon.in/","https://www.flipkart.com/"};

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		for(int i=0;i<url.length;i++) {
		WebDriver wb = new ChromeDriver();
		wb.get(url[i]);
		
			 wb.manage().window().maximize();
			
			Thread.sleep(4000);
			wb.close();
		}

	}

}
