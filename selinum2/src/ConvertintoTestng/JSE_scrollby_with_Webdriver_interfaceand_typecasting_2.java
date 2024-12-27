package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSE_scrollby_with_Webdriver_interfaceand_typecasting_2 {
	
	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://amazon.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*js.executeScript("window.scrollBy(0,10);");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,10);");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,10);");*/

		js.executeScript("window.scrollBy(0,30);");//total same bcz it follows continuous flow

		Thread.sleep(3000);
		driver.quit();
	}

}
