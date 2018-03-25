package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class VerifyAddPage {
@FindBy(xpath="//select[@id='sort']")
private WebElement lstbox;

@FindBy(xpath="//a[.='SanDisk Cruzer Blade SDCZ50-008G-I35 8GB USB 2.0 Pen Drive']")
private WebElement textPendriveName;

@FindBy(xpath="//input[@id='add-to-cart-button']")
private WebElement AddCartLink;


@FindBy(xpath="//span[@id='nav-cart-count']")
private WebElement cart;

@FindBy(xpath="//span[contains(text(),'SanDisk Cruzer Blade SDCZ50-008G-')]")
private WebElement textPen;


public VerifyAddPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clickListbox() {
	
	Select s=new Select(lstbox);
	s.selectByIndex(2);
}

public void textPendriveName() {
	
	textPendriveName.click();
}
public void clickAddCartLink() {
	
	AddCartLink.click();
}

public void clickCart() {
	cart.click();
}
public void verifyPendrive(String eText) {
	try {
	String aText=textPen.getText();
	Assert.assertEquals(aText, eText);
	Reporter.log("Pass",true);
	}
	catch(Exception e) {
		Reporter.log("Fail",true);
		Assert.fail();
	}
}


}
