package com.test;

import com.pages.Dictionary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.*;

public class TestDictionary {
    WebDriver driver;
    Dictionary dictionary;

   // Dictionary dictionary = new Dictionary(driver);
    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
         driver = new ChromeDriver();
        String baseUrl = "https://www.dictionary.com";
        driver.get(baseUrl);
    }

    @Test
    public void test_Homme_Page() throws IOException {
        dictionary = new Dictionary(driver);
        Assert.assertTrue(dictionary.getTitle().equalsIgnoreCase("DICTIONARY.COM"));

        BufferedReader br = new BufferedReader(new FileReader("C:\\dictionaryautomation\\DictionaryAutomation\\src\\com\\dictionary\\word.txt"));
        String line ="";
        while((line = br.readLine() )!=null) {
            System.out.println(line);


            dictionary.setSearchWord(line);
            dictionary.clickSearchBar();
            String meaning = dictionary.getMeaning();
            System.out.println(meaning);
            dictionary.clearSearchBar();
        }
    }


}
