package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFacebook {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Megha");
		
		driver.findElement(By.name("lastname")).sendKeys("shree");
		
		WebElement DOB = driver.findElement(By.id("day"));
		
		Select options = new Select(DOB);
		
		options.selectByValue("2");
		
		WebElement Month = driver.findElement(By.id("month"));
		
		Select option = new Select(Month);
		
		option.selectByIndex(7);
		
		WebElement Year = driver.findElement(By.id("year"));
		
		Select s = new Select(Year);
		
		s.selectByValue("2000");
		
		driver.findElement(By.id("sex")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Megha@123");
		
		driver.findElement(By.name("websubmit")).click();
		
		
		

	}

}
