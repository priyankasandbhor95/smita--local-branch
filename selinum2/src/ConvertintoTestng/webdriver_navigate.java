package ConvertintoTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webdriver_navigate {
	
	@Test
	public void abmethod() throws InterruptedException
	{
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://amazon.com");//get method
			Thread.sleep(2000);
			driver.get("https://flipkart.com");//get method
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			String str="https://www.facebook.com";//1st method with string arg
			driver.navigate().to(str);
			//or
			/*Thread.sleep(2000);
			driver.navigate().to("www.facebook.com");*/
			
			Thread.sleep(2000);
			driver.navigate().to("https://www.gmail.com");//2nd method accept string url argu 
			
			
			

			
			Thread.sleep(10000);
			driver.quit();


}
}