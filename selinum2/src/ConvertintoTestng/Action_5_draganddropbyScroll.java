package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_5_draganddropbyScroll {

	@Test
	public void task() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://flipkart.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("(//div[@class='PYKUdo'])[1]"));
		Actions act=new Actions(driver);
        act.dragAndDropBy(ele, 100, 0).perform();
        
        Thread.sleep(5000);
		driver.quit();
	}
	
}