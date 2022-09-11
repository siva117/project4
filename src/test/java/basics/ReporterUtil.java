package basics;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReporterUtil {
  
	public static ExtentReports reports;
	public static ExtentTest test;
	public static void main(String[] args) {
		
		
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("S:\\Reports\\Extent report.html");
		sparkreporter.config().setDocumentTitle("regression report");
		sparkreporter.config().setTheme(Theme.DARK);
		sparkreporter.config().setTimeStampFormat("dd-mm-yyyy hh:mm:ss");
		 reports= new ExtentReports();
		 reports.attachReporter(sparkreporter);
		
		  reports.setSystemInfo("operating system", System.getProperty("os.name"));
		  reports.setSystemInfo("username",System.getProperty("user.name"));
		  reports.setSystemInfo("browser", "Chrome");
		  reports.setSystemInfo("Ip address","12.12.12.123");
		  reports.setSystemInfo("sprint","agile(sprint 5)");
		  
		  tc1();
		  tc2();
		  tc3();
	}
	
	public static void tc1() {
		
		 test = reports.createTest("TC1");
		test.pass("loginpage has opened");
		test.pass("homepage has been displayed");
		test.pass("applicaation has been opened successfully");
		reports.flush();
		
	}
	
	public static void tc2() {
	    test = reports.createTest("TC2");
		test.pass("loginpage has opened");
		test.pass("homepage has been displayed");
		test.pass("applicaation has been opened successfully");
		reports.flush();
		
	}
	public static void tc3() {
    test = reports.createTest("TC3");
	test.pass("loginpage has opened");
	test.fail("homepage does not displayed",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\askri\\Pictures\\Screenshots\\Screenshot(1).png").build());
	test.pass("applicaation has been opened successfully");
	reports.flush();
	}
	
	
	
	
	
	
	
	
	
	
}
