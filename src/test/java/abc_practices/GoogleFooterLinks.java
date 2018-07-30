package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import static org.junit.Assert.assertEquals;

public class GoogleFooterLinks {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("Privacy"))
			System.out.println("The test passed");
		else
			System.out.println("The test failed");
		
		Assert.assertEquals(true,driver.getPageSource().contains("Privacy"));
		Assert.assertEquals(0,2-2);

		Thread.sleep(5000);
		driver.close();
		
	

	
	}



	
	}


