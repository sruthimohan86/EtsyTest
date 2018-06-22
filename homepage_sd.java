package com.etsy.step_defns;

//import com.etsy.methods.homepage_method;
//import com.etsy.utils.InvokeBrowser;
import com.etsy.methods.homepage_method;
import com.etsy.utils.InvokeBrowser;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class homepage_sd{
public class homepage_sd extends InvokeBrowser{
    public static homepage_method homepageMethod = PageFactory.initElements(InvokeBrowser.driver, homepage_method.class);


//    public WebDriver driver;

    @Given("^I enter homepage \"([^\"]*)\"$")
    public void iEnterHomepage(String url) {
//        ChromeDriverManager.getInstance().setup();
//        driver = new ChromeDriver();
        driver.get(url);
    }

    @And("^I accept settings$")
    public void iAcceptSettings() {
        driver.findElement(By.xpath("html/body/div[2]/div[1]/div[2]/div/div/div[2]/button")).click();
    }


    @When("^I click on search box$")
    public void iClickOnSearchBox() {
        driver.findElement(By.xpath(".//*[@id='search-query']"));
    }

    @When("^I enter \"([^\"]*)\" in search$")
    public void iEnterInSearch(String sportsshoes) {
        driver.findElement(By.id("search-query")).sendKeys(sportsshoes);
//        homepageMethod.searchtheterm(sportsshoes);
    }

    @And("^I click on search$")
    public void iClickOnSearch() {
        driver.findElement(By.xpath(".//*[@id='gnav-search']/div/div[2]/button")).click();
    }

    @And("^I click on sort by$")
    public void iClickOnSortBy() {
        driver.findElement(By.xpath(".//*[@id='sortby']/div/button")).click();
    }


    @And("^I sort by lowest price$")
    public void iSortByLowestPrice() {
        driver.findElement(By.xpath(".//*[@id='sortby']/div/div/div/ul/li[4]/a")).click();
    }

    @Then("^I should see the results as price from low to high$")
    public void iShouldSeeTheResultsAsPriceFromLowToHigh() {
//        List<WebElement> price = driver.findElements(By.xpath(".//*[@id='content']/div/div[1]/div/div/div[2]/div[2]/div[5]/div[1]/a[1]/div[2]/div/div/div"));


//        java.util.List<WebElement> price = InvokeBrowser.driver.findElements(By.cssSelector(".content .col-group .block-grid-xs-2 .v2-listing-card__info .n-listing-card__price .currency-value"));
        java.util.List<WebElement> price = InvokeBrowser.driver.findElements(By.xpath(".//*[@id='content']//*[contains(@class,\"currency-value\")]"));


        int loopsize ;
        if(price.size() > 10)
            loopsize = 10;
        else
            loopsize = price.size();

        for (int i =0; i<loopsize;i++)
            System.out.println("Price of Item : " + i + " is : " +  price.get(i).getText());


    }
//        // extract the prices from the price elements and store in a List
//        List<String> prices = new ArrayList<String>();
//        for (WebElement e : price)
//        {
//            prices.add(e.getText());
//        }
//
//// make a copy of the list
//        List<String> sortedPrices = new ArrayList<String>(prices);
//
//// sort the list
//        Collections.sort(sortedPrices);
//
//// true if the prices are sorted
//        System.out.println(sortedPrices.equals(prices));
//
////        ArrayList<Float> priceList = new ArrayList<Float>();
////        for (int i = 0; i<price.size(); i=i+1) {
////            priceList.add(Float.parseFloat(price.get(i).getText()));
////        }
////        for (int i = 0; i<price.size(); i=i+1)
////        {
////            System.out.println(price.get(i).getText());
////        }
    }

