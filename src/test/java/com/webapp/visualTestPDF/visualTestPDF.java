package com.webapp.visualTestPDF;

import com.web.core.base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class visualTestPDF extends TestUtilities {

    @Test
    public void verifyPDF() throws IOException, InterruptedException {
        String destination = "src/test/resources/testFiles/" + "INV0001" + ".pdf";
        log.info ("test");
        Assert.assertTrue (eyesManager.validatePDF(destination), "Error validating PDF");
    }

}
