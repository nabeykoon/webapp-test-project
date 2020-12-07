package com.webapp.dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "files", parallel = true)
    protected static Object[][] files() {
        return new Object[][]{
                {1, "Intel-logo.jpg"},
                {2, "download.png"},
                {3, "text.txt"}
        };
    }
}
