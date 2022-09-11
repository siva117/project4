package testnextG_2;

import org.jsoup.helper.DataUtil;
import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase_1 {
	
	
	
	@Parameters({"browser","env"})
   @Test
    public void tc1(@Optional String browser,String Environment) throws InterruptedException {
		System.out.println(Environment);
		
		
		
		
		
	  Driver driver = new Driver(browser);
	
	  driver.get().findElement(By.xpath("//input[@name='email']")).sendKeys("Krishna8712436@gmail.com");
	  driver.get().findElement(By.xpath("//input[@name='password']")).sendKeys("Krishna@117");
	  driver.get().findElement(By.xpath("//div[text()='Log in']")).click();
	  
	  Thread.sleep(3000);
	  
	  
	  
	  
	
	
       
	}
	

  public void login () {
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }









}
