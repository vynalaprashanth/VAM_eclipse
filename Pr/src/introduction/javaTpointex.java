package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaTpointex {

	public static void main(String args[]) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String url = "http://google.com/";
		driver.manage().window().maximize();
		driver.get(url);
		WebElement s = driver.findElement(By.xpath("//*[@type='search']"));
		s.sendKeys("javatpoint");
		s.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//h3[@class=\"LC20lb MBeuO DKV0Md\"])[1]")).click();
		
		
		
		
		
		
		

	}
}
