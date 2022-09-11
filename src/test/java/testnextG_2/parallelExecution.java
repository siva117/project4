package testnextG_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelExecution {

	public class ParallelTest {

		 public WebDriver driver;
		 @Test
		  public void FirefoxTest() {	 
		//Initializing the firefox driver (Gecko)
			 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
			  WebDriverManager.chromedriver().setup();  
			  driver.get("https://www.demoqa.com"); 
			  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
			  driver.quit();

		  }
		 
		 @Test
		 public void ChromeTest()
		 { 
		       //Initialize the chrome driver
		       System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		       WebDriverManager.firefoxdriver().setup();  
		       driver.get("https://www.demoqa.com"); 
		       driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		       driver.quit();
		 }
		}
		
}
