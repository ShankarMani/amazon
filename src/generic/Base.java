package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base implements Iconst {

// Instantiating the Browser variable the  as public so that is can be used thought the code.	
	public WebDriver driver;

// Setting the path of Driver Executable in the beginning  
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}

// Writing the Before method to decide browser to be opened and then opening it and reaching to "Base URL"  	
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void openApp(@Optional("chrome")String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}
		
		String url =AL.getProperty(SETTING_PATH, "URL");
		driver.get(url);
		driver.manage().window().maximize();
		String strITO=AL.getProperty(SETTING_PATH, "ITO");
		Long ITO=Long.parseLong(strITO);
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	}

// Writing the After method to decide whether a test if fail or pass. If test fails, takes the Screenshot else just closes the browser.  
	@AfterMethod
	public void closeApp(ITestResult res) {
		String name=res.getName();
		int Status=res.getStatus();
		if(Status==2) {
			String imgPath=AL.getPhoto(driver,PHOTO_PATH,name);
			Reporter.log(imgPath, true);
		}
		driver.close();
	}
}
