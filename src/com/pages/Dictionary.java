package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dictionary {
    WebDriver driver;

    @FindBy(xpath="//*[@id=\"searchbar_input\"]")
    WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"dictionary-nav-tab\"]")
    WebElement title;

    @FindBy(id="search-submit")
    WebElement searchButton;

    @FindBy(xpath="//*[@id=\"base-pw\"]/main/section/section/div[1]")
    WebElement meaningSection;

    public Dictionary(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);
    }



    public String getTitle(){
        return  title.getText();
    }

    public void setSearchWord(String searchWord){
       searchBar.sendKeys(searchWord);
    }

    public void clickSearchBar(){
        searchButton.click();
    }

    public String  getMeaning(){
        return meaningSection.getText();
    }
    public void clearSearchBar(){
        searchBar.clear();
    }

}
