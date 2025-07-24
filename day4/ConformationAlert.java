package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConformationAlert {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		Alert Conformation = driver.switchTo().alert();
		
		String text = Conformation.getText();
		
		System.out.println(text);
		
		Conformation.accept();
		

	}
}
