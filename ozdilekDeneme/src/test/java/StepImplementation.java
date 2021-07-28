import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.aspectj.weaver.ast.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.security.SecureRandom;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class StepImplementation extends BaseTest {

    @Step("<key> id li elemente tıkla")
    public void clickBYid(String key) throws InterruptedException {
        appiumDriver.findElement(By.id(key)).click();
        //Thread.sleep(2500);

    }

    @Step("<number> saniye bekle")
    public void waitForSeceond(int number) throws InterruptedException {
        Thread.sleep(number * 1000);
    }


    @Step("<path> xpath li elemente tıkla")
    public void clickBYxpath(String path) {
        appiumDriver.findElement(By.xpath(path)).click();

    }


   @Step("<id> li element <text> text değerini içeriyormus kontrol et")
   public void textControl(String id,String text){
       Assert.assertTrue("Element bulunamadı",appiumDriver.findElement(By.id(id)).getText().equals(text));
   }

    @Step("<xpath> li element <text> text değerini içeriyor mu kontrol et")
    public void textControlXpath(String xpath, String text){
        Assert.assertTrue("Element bulunamadı",appiumDriver.findElement(By.xpath(xpath)).getText().equals(text));
    }


}


