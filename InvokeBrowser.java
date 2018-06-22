package com.etsy.utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {
    public static WebDriver driver;

    public void OpenBrowser() {
        String browser = System.getProperty("browser");


        if (browser.equals("chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equals("firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        }
//        invokeBrowser.get(url);
    }
}
