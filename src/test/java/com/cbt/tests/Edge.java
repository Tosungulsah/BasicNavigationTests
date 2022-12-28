package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import static com.cbt.utilities.StringUtility.verifyEquals;

public class Edge {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        //2- Go	to	website	https://google.com
        driver.navigate().to("https://google.com");

        //3- Save the	title in	a	string	variable
        String googleTitle= driver.getTitle();
        //4. Go	to	https://etsy.com
        driver.get("https://etsy.com");

        Thread.sleep(2000);
        //5. Save the	title	in	a	string	variable

        String etsyTitle= driver.getTitle();

        //6. Navigate	back	to	previous page
        driver.navigate().back();

        // 7- Verify	that	title	is	same is	in	step 3
        verifyEquals(googleTitle,driver.getTitle());

        Thread.sleep(1000);
        //8. Navigate	forward	to	previous	page
        driver.navigate().forward();
        verifyEquals(etsyTitle, driver.getTitle());

        driver.close();
    }
}
