package com.chirag.learn;

import Utils.WebpageHelper;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    WebpageHelper webpageHelper;

    String URL ="http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html";

//    public static WebDriver driver;

    @Before
    public void openMyTestEnv(){
        webpageHelper =new WebpageHelper();
        webpageHelper.openMyTestEnv(URL);
        webpageHelper.printMessage("My Browser has opened.");
    }

    @After
    public void  closeMyTestEnv (){
        webpageHelper.closeBrowser();
        webpageHelper.printMessage("I have closed my browser.");

    }


}
