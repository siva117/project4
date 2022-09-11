package pages.impl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.Driver;
import pages.ILoginPage;

public class LoginPage implements ILoginPage{
	
	@FindBy(id = "txtUsername")
	private WebElement txtUserName;
	
	@FindBy(id = "txtPassword")
	private WebElement txtPassWord;
	
	@FindBy(how=How.ID,using = "btnLogin")
	private WebElement btnLogin;
	
	@FindBy(partialLinkText = "Forgot your password")
	private WebElement lnkForgotPassword;
	
	@FindBy(id="spanMessage")
	private WebElement elemErrorMessage;
	
	public LoginPage() {
		 PageFactory.initElements(Driver.get(), this);
	}
	
	public void login(String userName, String passWord) {
		txtUserName.sendKeys(userName);
		txtPassWord.sendKeys(passWord);
		btnLogin.click();
	}
	
	public void clickForgotPassword() {
		lnkForgotPassword.click();
		
	}
	
	public boolean isLoginPageDisplayed() {
		return txtUserName.isDisplayed();
	}
	
	public String getLoginErrorMessage() {
		return elemErrorMessage.getText();
	}


}
