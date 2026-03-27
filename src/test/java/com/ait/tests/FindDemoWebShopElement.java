package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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



        //className
        WebElement class_heder_logo = driver.findElement(By.cssSelector(".header-logo"));
        System.out.println(class_heder_logo.getText());

        //contains -> *    поиск по определёному слову из класса
        WebElement wrapper = driver.findElement(By.cssSelector("[class*='wrapper']"));
        System.out.println(wrapper.getText());

        //end to -> $ по конечному слову из класса
        WebElement service = driver.findElement(By.cssSelector("[class$='service']"));
        System.out.println(service.getText());


        //ID
        WebElement topcarlink = driver.findElement(By.cssSelector("#topcartlink"));
        System.out.println(topcarlink.getText());

        //[key='value']
        WebElement logo = driver.findElement(By.cssSelector("img[alt='Tricentis Demo Web Shop']"));
        System.out.println(logo.getText());


        //<tag> or <class> or <id>:nth-child(n)
        WebElement information = driver.findElement(By.cssSelector(".information:nth-child(1)"));
        System.out.println(information.getText());

        WebElement wishlist = driver.findElement(By.cssSelector("[href='/wishlist']"));
        System.out.println(wishlist.getText());



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

        //driver.findElement(By.cssSelector("[class$='service']"));
        driver.findElement(By.xpath("//*[contains(@class,'service')]"));

        //driver.findElement(By.cssSelector("#topcartlink"));
        driver.findElement(By.xpath("//*[@id='topcartlink']"));

        //driver.findElement(By.cssSelector("img[alt='Tricentis Demo Web Shop']"));
        driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));

        //driver.findElement(By.cssSelector(".information:nth-child(1)"));
        driver.findElement(By.xpath("//*[contains(@class,'information')][1]"));

        //driver.findElement(By.cssSelector("[href='/wishlist']"));
        driver.findElement(By.xpath("//*[@href='/wishlist']"));

    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
