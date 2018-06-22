package com.etsy.methods;

import com.etsy.utils.InvokeBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class homepage_method {


    public void searchtheterm(String sportsshoes) {
    }

    public class homepage_methods extends InvokeBrowser {

        @FindBy(xpath = "html/body/div[2]/div[1]/div[2]/div/div/div[2]/button")
        public WebElement settings;

        @FindBy(xpath = ".//*[@id='search-query']")
        public WebElement search;

        @FindBy(id = "search-query")
        public WebElement term;

        @FindBy(xpath = ".//*[@id='gnav-search']/div/div[2]/button")
        public WebElement search2;

        @FindBy(xpath = ".//*[@id='sortby']/div/button")
        public WebElement sort;

        @FindBy(xpath = ".//*[@id='sortby']/div/div/div/ul/li[4]/a")
        public WebElement lowest;

        @FindBy(xpath = ".//*[@id='content']/div/div[1]/div/div/div[2]/div[2]/div[5]/div[1]/a[1]/div[2]/div/div/div")
        public WebElement result;

        public void searchtheterm(String sportsshoes) {term.sendKeys(sportsshoes);

            settings.click();
            search.click();

            search2.click();
            sort.click();
            lowest.click();
            result.getText();
        }
    }
}
