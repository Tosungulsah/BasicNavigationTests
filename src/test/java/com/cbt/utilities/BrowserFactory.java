package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getDriver (String webBrowser) {
        if (webBrowser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (webBrowser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else if(webBrowser.equalsIgnoreCase("edge") ){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else if(webBrowser.equalsIgnoreCase("safari")){
            System.out.println("Given browser type doesnt exist not currently supported");
            System.out.println("Driver= null");
            return null;
        }else {
            System.out.println("Given browser type doesnt exist not currently supported");
            System.out.println("Driver= null");
            return null;
        }

    }
}

