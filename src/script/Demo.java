package script;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void VerifyPrice()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[5]/div[6]/a/span[1]")).click();
		 
		 driver.findElement(By.id("add-to-cart-button")).click();
		 
		 //verify 
		WebDriverWait wait= new WebDriverWait(driver, 15);
		{
			wait.until(ExpectedConditions.titleContains("Amazon Sign In"));
		}
		
		
	
		
	}

}
