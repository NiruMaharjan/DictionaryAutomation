package com.dictionary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDictionaryAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.dictionary.com";

        String expectedTitle = "Dictionary.com | Meanings and Definitions of Words at Dictionary.com";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        System.out.println("actualTitle "+actualTitle);
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        }
        else{
            System.out.println("Test Failed");
        }
        //close fire fox
        driver.close();

    }
}
