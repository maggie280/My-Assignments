package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("guest");
		 
			
			ChromeDriver driver = new ChromeDriver(options);
			

					driver.get("http://leaftaps.com/opentaps/control/main");

				
					driver.manage().window().maximize();

					
					driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

					
					driver.findElement(By.id("password")).sendKeys("crmsfa");

					
					driver.findElement(By.className("decorativeSubmit")).click();
					
					
					driver.findElement(By.linkText("CRM/SFA")).click();
					
					driver.findElement(By.linkText("Create Account")).click();
					
					driver.findElement(By.id("accountName")).sendKeys("Leaf");
					
					driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
					
					driver.findElement(By.id("numberEmployees")).sendKeys("500");
					
					driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
					
					driver.findElement(By.className("smallSubmit")).click();

	}

}
