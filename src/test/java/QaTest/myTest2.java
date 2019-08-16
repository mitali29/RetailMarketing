package QaTest;

import com.chirag.learn.Hooks;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utils.WebpageHelper.driver;


public class myTest2 extends Hooks {

    @Test
    public void myExplicitWait1(){
        WebDriverWait explicitWait = new WebDriverWait(driver,4);

       driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
       explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='WebDriver']")));
       String elementText = driver.findElement(By.xpath("//p[text()='WebDriver']")).getText();
       System.out.println(elementText);
    }


}
