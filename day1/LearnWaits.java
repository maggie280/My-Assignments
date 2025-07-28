package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {

public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		System.out.println(until);
		
		String title = driver.getCurrentUrl();
		
		System.out.println(title);
		
		
}

}
