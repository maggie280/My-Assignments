package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Leafground {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
				options.addArguments("guest");
				
				ChromeDriver driver = new ChromeDriver(options);
				
				driver.get("https://leafground.com/button.xhtml");
				
				driver.manage().window().maximize();
	
				driver.findElement(By.xpath("//span[text()='Click']")).click();
				
				String title = driver.getTitle();
				
				System.out.println("Title of the page is : " + title);
				
				driver.navigate().back();
				
				boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
				System.out.println("element is enabled  : " +enabled);
				
				Point location = driver.findElement(By.xpath("//span[text()='Submit'][1]")).getLocation();
				System.out.println("element located at  : " +location);
				
				String value = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
				System.out.println("Color of the button :  " +value);
				
				Dimension size = driver.findElement(By.id("j_idt88:j_idt98")).getSize();
				System.out.println("element size is :  " +size);
				
				driver.close();
				
				
				
				
	}
	
	

}
