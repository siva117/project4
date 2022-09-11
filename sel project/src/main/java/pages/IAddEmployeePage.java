package pages;

public interface IAddEmployeePage {
	
	void enterEmployeeBasicInfo(String firstName, String middleName, String lastName, String empId);
	
	void enterEmployeeBasicInfo(String firstName, String middleName, String lastName);
	
	void enterEmployeeBasicInfo(String firstName, String lastName);
	
	void enterEmployeeLoginInfo(String userName, String passWord, String status);
	
	void clickSaveButton();
	
	void getCurrentEmpId();

}
