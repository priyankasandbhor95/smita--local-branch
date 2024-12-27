package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_9__scrolltoele_scrollbyamt {
	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.oracle.com/in/database/");
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.className("rc32w2"));
		act.scrollToElement(ele).perform();
		Thread.sleep(3000);
		
		WebElement ele1=driver.findElement(By.className("rc29w1"));
		act.scrollToElement(ele1).perform();
		Thread.sleep(3000);

		act.scrollByAmount(0,1000).perform();
		act.sendKeys(Keys.END).perform();
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}