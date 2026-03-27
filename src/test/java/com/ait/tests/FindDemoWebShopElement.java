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

    @Test
    public void findElementByxPath(){
        //driver.findElement(By.cssSelector("[href='/register']"));
        driver.findElement(By.xpath("//*[@href='/register']"));

        //driver.findElement(By.cssSelector("#small-searchterms"));
        driver.findElement(By.xpath("//*[@id='small-searchterms']"));


        //By.cssSelector(*.header-logo)
        driver.findElement(By.xpath("//*[@class='header-logo']"));

        //("[class*='wrapper']")
        driver.findElement(By.xpath("//*[contains(@class,'wrapper')]"));


    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
