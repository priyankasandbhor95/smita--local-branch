package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSE_scrollTooooo_with_Webdriver_interfaceand_typecasting_2 {

	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://amazon.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*js.executeScript("window.scrollTo(0,10);");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,20);");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,5);");
		Thread.sleep(3000);*/

		js.executeScript("window.scrollTo(0,35);");//total is not same bcz it not follows continuous flow here it every time goes from start

		Thread.sleep(3000);
		driver.quit();
	}
	
}