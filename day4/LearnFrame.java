package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrame {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(2);
		
		WebElement element = driver.findElement(By.xpath("//iframe[@name='frame2']"));
		
		driver.switchTo().frame(element);
		
		driver.findElement(By.id("Click")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
	}

}
