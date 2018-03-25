package script;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import generic.Base;
import generic.XL;
import page.ClicksPage;
import page.VerifyAddPage;
import page.VerifyTheSearchPage;

public class AddTest extends Base{

	@Test
	public void testAdd() {
	String un=XL.getcellValue(INPUTDATAXL_PATH, "Sheet1", 1, 0);
	VerifyTheSearchPage v=new VerifyTheSearchPage(driver);
	v.setElement(un);
	
	ClicksPage c=new ClicksPage(driver);
	c.scrollDown(driver);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	c.clickOnSD();
	
	VerifyAddPage p=new VerifyAddPage(driver);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	p.clickListbox();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	p.textPendriveName();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
	java.util.Set<String> s = driver.getWindowHandles();
	for(String s1:s) {
	driver.switchTo().window(s1);
	}
	p.clickAddCartLink();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
	for(String s1:s) {
		driver.switchTo().window(s1);
		}
	p.clickCart();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
	
p.verifyPendrive(
		"SanDisk Cruzer Blade SDCZ50-008G-I35 8GB USB 2.0 Pen Drive");
	

	}
}
