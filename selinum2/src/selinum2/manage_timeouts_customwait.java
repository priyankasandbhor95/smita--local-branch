package selinum2;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage_timeouts_customwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/login");

		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Forgot password?")).click();
		/*
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("forgot_password_input")));
		*/
		int i=0;
		while(i<100)
		{
		try {
		driver.findElement(By.name("forgot_password_input")).sendKeys("priyanka@gmail.com");
		break;
		}
		catch (NoSuchElementException e) {
			
			// TODO: handle exception
			i++;
		}
		}
		
		System.out.println(i);
		Thread.sleep(3000);
		driver.quit();

	}

}
