package testnextG_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test123  {


	@Parameters("browser")
	@Test()
	public void tc4( String browser) throws InterruptedException {
    	
           
		Driver driver = new Driver(browser);
		System.out.println("i am in test4"+ browser);
		
		driver.navigate("https://www.google.com/");
	
		String er=driver.get().getTitle();
		System.out.println(er);
		
		
		
		
		Thread.sleep(3000);
	}
	
	
}
