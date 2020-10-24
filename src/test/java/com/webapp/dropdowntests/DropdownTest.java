package com.webapp.dropdowntests;

import com.web.core.base.TestUtilities;
import com.webapp.pages.DropdownPage;
import com.webapp.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends TestUtilities {
	
	@Test
	public void optionTwoTest() {
		log.info("Starting optionTwoTest");

		// open main page
		WelcomePage welcomePage = new WelcomePage(getDriver (), log);
		welcomePage.openPage();

		// Click on Dropdown link
		DropdownPage dropdownPage = welcomePage.clickDropdownLink();

		// Select Option 2
		dropdownPage.selectOption(2);

		// Verify Option 2 is selected
		String selectedOption = dropdownPage.getSelectedOption();
		Assert.assertTrue(selectedOption.equals("Option 2"),
				"Option 2 is not selected. Instead selected - " + selectedOption);
	}
}
