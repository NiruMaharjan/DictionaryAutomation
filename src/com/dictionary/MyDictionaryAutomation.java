package com.dictionary;

import com.pages.Dictionary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MyDictionaryAutomation {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.dictionary.com";
        Dictionary dictionary = new Dictionary(driver);

        String expectedTitle =  dictionary.getTitle();
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
//        File file = new File("word.txt");
//        FileReader fr = new FileReader(file);
//        BufferedReader reader =

        String fileName = "C:\\dictionaryautomation\\DictionaryAutomation\\src\\com\\dictionary\\word.txt";

       InputStream fis = new FileInputStream(fileName);
             InputStreamReader isr = new InputStreamReader(fis,
                     StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr);
             String word = br.readLine();
        System.out.println(word);



       dictionary.setSearchWord(word);
        br.close();


        //close fire fox
        driver.close();

    }
}
