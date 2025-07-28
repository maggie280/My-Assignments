package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {
	
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
					
					driver.findElement(By.xpath("//a[text()='Contacts']")).click();
					
					driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
					
					driver.findElement(By.xpath("//a[contains(@href,'partyIdFrom')]")).click();
					
					WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));
					
					Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
					
					System.out.println(until);
					
					Set<String> windows = driver.getWindowHandles();
					
					List<String> handle = new ArrayList<String>(windows);
					
					String parent = handle.get(0);
					
					System.out.println(parent);
					
					String child = handle.get(1);
					
					System.out.println(child);
					
					driver.switchTo().window(child);
					
					driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]")).click();
					
					driver.switchTo().window(parent);
					
					driver.findElement(By.xpath("//a[contains(@href, 'partyIdTo')]")).click();
					
				    driver.switchTo().window(child);
					
					driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[2]")).click();
					
					driver.switchTo().window(parent);
					
					driver.findElement(By.xpath("//a[text()='Merge']")).click();
					
					Alert alert = driver.switchTo().alert();
					
					alert.accept();
					
					String title = driver.getTitle();
					
					System.out.println(title);
					
									
					
	}

}
