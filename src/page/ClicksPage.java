package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ClicksPage {
	@FindBy(xpath="(//span[.='SanDisk'])[15]")
	private WebElement scanDisk;
	
	@FindBy(xpath="//span[.='4 Stars & Up']")
	private WebElement fourStar;
	
	//@FindBy(xpath="//input[@id='low-price']")
	//private WebElement min;
	
	//@FindBy(xpath="//input[@id='high-price'] ")
	//private WebElement max;
	
	//@FindBy(xpath="//*[@id=\"result_0\"]/div/div[5]/div[1]/a/span[2]")
	//private WebElement ssT;
	
	public ClicksPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnSD() {
		scanDisk.click();
	}
	
	public void clickOn4Star() {
        fourStar.click();	
        }
	public void scrollDown(WebDriver driver) {
		for(int i=0;i<=2;i++) {
		 JavascriptExecutor j=(JavascriptExecutor)driver;
		 j.executeScript("window.scrollBy(0,100)");
	}
	}
	
	
		//public void setMin(String mn) {
			//min.sendKeys(mn);
	//	}
		
		
	//public void setMax(String mx) {
		//max.sendKeys(mx);
		//max.sendKeys(Keys.ENTER);
	//}
	
	//public void clickonssT() {
		//ssT.click();
	//}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
