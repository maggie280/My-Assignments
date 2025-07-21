package week3.day1;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		
		System.out.println("username entered");
		

	}
	
	public void enterPassword() {
		
		System.out.println("Password eneterd");

	}
	
	public static void main(String[] args) {
		
		LoginTestData login = new LoginTestData();
		
		login.enterCredentials();
		login.enterUsername();
		login.enterPassword();
		login.navigateToHomePage();
		
		
	}
	
	
	

}
