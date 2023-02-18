package testscripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FourthTest extends BaseClass{

	@Test
	public void fourthTest() {
		SoftAssert soft = new SoftAssert();

		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();

		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		
		web.scrollToElement(skillraryDemo.getContactUs());
		skillraryDemo.clickContactUs();
		
		soft.assertTrue(contact.getPageHeader().isDisplayed());
		
		List<String> data = excel.fetchDataFromExcel("Sheet1");
		contact.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));
		
		soft.assertAll();
		
	}
}
