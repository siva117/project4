package testnextG_2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver1 {

	private WebDriver driver;
	public Driver1(String browser) {
		
		
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
		default:
		case"safari":
			WebDriverManager.safaridriver().setup();
			break;
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	
	public void navigate(String url) {
		driver.get(url);
	}
	
	
	public WebDriver get() {
		return driver;
	}
	
	
	
	public void closewindow() {
		driver.close();
		
		
	}
	public void closeallWindows() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
