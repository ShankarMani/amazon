package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Base;
import generic.XL;
import page.VerifyTheSearchPage;

public class VerifyTest extends Base {
	@Test
	public void testVerifyTest() {
		String un=XL.getcellValue(INPUTDATAXL_PATH, "Sheet1", 1, 0);
		Reporter.log(un,true);
		VerifyTheSearchPage v=new VerifyTheSearchPage(driver);
		v.setElement(un);
		String ePendriveTitle=XL.getcellValue(INPUTDATAXL_PATH, "Sheet1", 1, 1);
		v.verifyPendrivePage(driver, ePendriveTitle);
		
}
}
