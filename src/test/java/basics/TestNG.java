package basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testnextG_2.Testcasesforanntations;

public class TestNG extends Testcasesforanntations{
    @DataProvider
	public Object[][] Data(){
	 Object[][] getdata=new Object[2][4];
	 
	 getdata[0][0]="mv";
	 getdata[0][1]="rt";
	 getdata[0][2]="rtr";
	 getdata[0][3]="rr";
	 getdata[1][0]="mt";
	 getdata[1][1]="mfs";
	 getdata[1][2]="ty";
	 getdata[1][3]="TUV";
	
	 return getdata;
	}
	
	@Test(dataProvider="Data")
	public void createcompany(String a,String b,String c,String d) {
		System.out.println("in create company");
	}
	@Test(priority=1,groups={"delete","modify"})
	public void deletecompany() {
		
		System.out.println("in delete company");
	}
	@Test(priority=-1,groups="create")
	public void createemployee() {
		System.out.println("in add emplooyee");
	}
	@Test(priority=0,groups="delete")
	public void deletemultiplecompanies() {
		System.out.println("in company delete ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
