package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("guest");
		 
			
			ChromeDriver driver = new ChromeDriver(options);
			

					driver.get("http://leaftaps.com/opentaps/control/main");

					driver.manage().window().maximize();

					driver.findElement(By.id("username")).sendKeys("democsr");

					driver.findElement(By.id("password")).sendKeys("crmsfa");

					driver.findElement(By.className("decorativeSubmit")).click();
					
					driver.findElement(By.linkText("CRM/SFA")).click();
					
					driver.findElement(By.linkText("Leads")).click();
					
					driver.findElement(By.linkText("Create Lead")).click();
					
					driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
					
					driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Megha");
					
					driver.findElement(By.id("createLeadForm_lastName")).sendKeys("shree");
					
					driver.findElement(By.name("departmentName")).sendKeys("Testing");
					
					driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
					
					driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("megha123@gmail.com");
					
					WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
					
					Select option = new Select(State);
					
					option.selectByVisibleText("New York");
					
					driver.findElement(By.xpath("//input[@name='submitButton']")).click();
					
					driver.findElement(By.linkText("Edit")).click();
					
					driver.findElement(By.name("description")).clear();
					
					driver.findElement(By.name("description")).sendKeys("Testing in progress");
					
					driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
					
					String title = driver.getTitle();
					
					System.out.println(title);
					
					driver.close();


	}

}
