package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://rahulshettyacademy.com/locatorspractice/";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Prashanth");
		driver.findElement(By.name("inputPassword")).sendKeys("rahul");
		driver.findElement(By.name("chkboxOne")).isSelected();
		driver.findElement(By.name("chkboxTwo")).isSelected();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='reset-pwd-btn']")).click();

	}

}
