package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        ChromeDriver driver = new ChromeDriver(opt);
        
        driver.get("https://www.tatacliq.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		
		act.moveToElement(brands).perform();


       Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Watches & Accessories']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]")).click();
		
		WebElement element = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		
		Select sort= new Select(element);
		
		sort.selectByVisibleText("New Arrivals");
		
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilName'])[1]")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		
		String product1 = prices.get(0).getText();
		System.out.println("The price of the first product is "+product1);
		
		for(WebElement price :prices) {
			
			System.out.println(price.getText());
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windowHandle= new ArrayList<String>(windowHandles);
		
		String parent = windowHandle.get(0);
		String child = windowHandle.get(1);
		driver.switchTo().window(child);
		
		String product= driver.findElement(By.xpath("//h3[contains(text(),'MRP:  ')]")).getText();
		
		System.out.println(product);
		
		if(product.contains(product1)) {
			
			System.out.println("MRP Matches");
		}
		
		else {
			
			System.out.println("Doesn't match");
		}
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
		String count = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		
		System.out.println(count);
		
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File destination = new File ("./Data/Tatacliq.png");
		
		FileUtils.copyFile(source, destination);
		
		driver.close();
	}
	

}
