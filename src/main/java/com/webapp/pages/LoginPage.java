package com.webapp.pages;

import com.web.core.base.BasePageObject;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {

    private By usernameLocator = By.id ("username");
    private By passwordLocator = By.name ("password");
    private By logInButtonLocator = By.tagName ("button");
    private By loginErrorMessage = By.id ("flash");

    public LoginPage(WebDriver driver, Logger log) {
        super (driver, log);
    }

    /**
     * Execute log in
     */
    @Step("Type valid username and password")
    public SecureAreaPage logIn(String username, String password) {
        genericLogIn (username, password);
        return new SecureAreaPage (driver, log);
    }

    @Step("Type invalid username or password")
    public LoginPage negativeLogIn(String username, String password) {
        genericLogIn (username, password);
        return this;
    }
    @Step("Retrieve login error message text")
    public String getLoginErrorMessage() {
        waitForVisibilityOf (loginErrorMessage, 5);
        return find (loginErrorMessage).getText ();
    }

    // Private methods
    private void genericLogIn(String username, String password) {
        log.info ("Executing LogIn with username [" + username + "] and password [" + password + "]");
        type (username, usernameLocator);
        type (password, passwordLocator);
        click (logInButtonLocator);
    }

}
