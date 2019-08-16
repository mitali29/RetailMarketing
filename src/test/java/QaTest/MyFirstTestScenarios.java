package QaTest;

import static Utils.WebpageHelper.driver;
import static org.junit.Assert.assertEquals;


import com.chirag.learn.Hooks;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MyFirstTestScenarios extends Hooks {


    public void clickDealButton() throws InterruptedException {

        driver.findElement(By.id("hdr-deals")).click();
        Thread.sleep(7000);
        driver.findElement(By.id("qf-1q-destination")).sendKeys("Rome" + Keys.TAB);
        Thread.sleep(3000);
    }

    @Test
    public void assertTest(){

        String expectedValue1 = "India";
        String actualValue2 = "India1";
        assertEquals(expectedValue1,actualValue2);
        System.out.println("My Assert is passed.");


    }

}
