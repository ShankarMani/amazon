package script;



import org.testng.annotations.Test;

import generic.Base;
import generic.XL;
import page.ClicksPage;
import page.VerifyTheSearchPage;

public class ClicksTest extends Base {
@Test
public void testClicks() {
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
	try {
		Thread.sleep(3000);
	}catch(Exception e) {}
	c.scrollDown(driver);
	//c.setMin("300");
	//c.setMax("1000");
	try {
		Thread.sleep(2000);
	}catch(Exception e) {}
	c.scrollDown(driver);
	c.clickOn4Star();
	
}	
}
