package pages;

public interface ILoginPage {

	void login(String userName, String passWord);
	
	void clickForgotPassword();
	
	boolean isLoginPageDisplayed();
	
	String getLoginErrorMessage();
	
}
