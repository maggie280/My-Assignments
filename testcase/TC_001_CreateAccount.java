package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_CreateAccount extends BaseClass {

	@Test
	public void createAccount() {
		LoginPage lp=new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clikCrmsfa()
		.clickAccountsLink()
		.clickCreateAccount()
		.enterAccountName()
		.enterDescription()
		.enterNoOfEmployees()
		.enterSiteName()
		.clickBtn()
		.verifyAccount();
		
		
		
		
		
		
		
	
       

        
	}
	
}
