package page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class VerifyTheSearchPage {
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement srchTB;
	
	
	
	

	public VerifyTheSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setElement(String un) {
		srchTB.sendKeys(un);
		srchTB.sendKeys(Keys.ENTER);
	}
	public void verifyPendrivePage(WebDriver driver,String ePendriveTitle) {
		WebDriverWait wait=new WebDriverWait(driver, 15);
		try {
			wait.until(ExpectedConditions.titleContains(ePendriveTitle));
			Reporter.log("Pass:Pendrive Page is Displayed", true);
		}catch(Exception e) {
			Reporter.log("Pass:Pendrive Page is Not Displayed", true);
			Assert.fail();
		}
	}
		
  
        
        
        
        
		
			
		
		
		
		
		
}
