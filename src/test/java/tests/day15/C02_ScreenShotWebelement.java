package tests.day15;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_ScreenShotWebelement extends TestBase {
    @Test
    public void nutellaTesti() throws IOException {

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("nutella" + Keys.ENTER);
        WebElement sonucYazisiElementi=driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        String sonucSayisiStr=sonucYazisiElementi.getText();
        Assert.assertTrue(sonucSayisiStr.contains("nutella"));

        File webelementSS=new File("target/screenShot/webelement.jpeg");
        File geciciResim=sonucYazisiElementi.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,webelementSS);








       //TakesScreenshot tss=(TakesScreenshot) driver;
      ///  File tumSayfaSS=new File("target/screenShot/tumsayfa.png");
       // File geciciResim =tss.getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(geciciResim,tumSayfaSS);

    }
}
