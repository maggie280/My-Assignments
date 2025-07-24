package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement element = driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame(element);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert popup = driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		String text = popup.getText();
		
		System.out.println(text+" "+"Harry potter");
		
		popup.accept();
		
			
		
		
	}
	

}
