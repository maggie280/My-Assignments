package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWindow {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> Handles = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(Handles);
		
		String parent = windows.get(0);
		
		System.out.println(parent);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.switchTo().window(parent);
		
		driver.close();
		
	
		
		
	}

}
