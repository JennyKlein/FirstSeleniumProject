package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindDemoWebShopElement {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByCssSelector(){
        //register link
        driver.findElement(By.cssSelector("[href='/register']"));

        //search input
        driver.findElement(By.cssSelector("#small-searchterms"));

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
