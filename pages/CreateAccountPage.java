package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateAccountPage extends BaseClass {

	
	public CreateAccountPage enterAccountName() {
		
		driver.findElement(By.id("accountName")).sendKeys("Leaf");	
		return this;
	}
	
	public CreateAccountPage enterDescription() {
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		return this;
	}
	
	public CreateAccountPage enterNoOfEmployees() {
		
		driver.findElement(By.id("numberEmployees")).sendKeys("500");
		
		return this;
		

	}
	
	public CreateAccountPage enterSiteName() {
		
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		return this;
		
	}
	
	public VeiwAccountPage clickBtn() {
		
		driver.findElement(By.className("smallSubmit")).click();
		
		return new VeiwAccountPage();
		

	}
	
	
	
}

