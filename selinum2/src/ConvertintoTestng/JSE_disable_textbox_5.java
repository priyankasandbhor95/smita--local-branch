package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSE_disable_textbox_5 {
	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/index.php");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele1=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].value='Hello world';",ele1);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
