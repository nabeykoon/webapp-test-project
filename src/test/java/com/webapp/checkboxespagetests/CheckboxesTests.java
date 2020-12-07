package com.webapp.checkboxespagetests;

import com.applitools.eyes.MatchLevel;
import com.web.core.base.TestUtilities;
import com.webapp.pages.CheckboxesPage;
import com.webapp.pages.WelcomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTests extends TestUtilities {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify file upload user scenario - Allure desc")
    public void selectingTwoCheckboxesTest() {
        log.info ("Starting selectingTwoCheckboxesTest");

        // open main page
        WelcomePage welcomePage = new WelcomePage (getDriver (), log);
        welcomePage.openPage ();

        // Click on Checkboxes link
        CheckboxesPage checkboxesPage = welcomePage.clickCheckboxesLink ();
       // eyesManager.validateWindow (MatchLevel.STRICT, false);
        takeScreenshotInTest ("checkboxScreen", getDriver ());
        // Select All Checkboxes
        checkboxesPage.selectAllCheckboxes ();
        // Verify all checkboxes are checked
        Assert.assertTrue (checkboxesPage.areAllCheckboxesChecked (), "Not all checkboxes are checked");

    }

}
