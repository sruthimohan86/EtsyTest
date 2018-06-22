package com.etsy.utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    InvokeBrowser invokeBrowser = new InvokeBrowser();
//    BasePage basePage = new BasePage();

    @Before
    public void OpenBrowser() {
//Open a Browser
//        basePage.OpenBrowser();
        invokeBrowser.OpenBrowser();
    }

//    @After
//    public void CloseBrowser() {
////        to close the browser
////        basePage.invokeBrowser.quit();
//        invokeBrowser.driver.quit();
//    }
}
