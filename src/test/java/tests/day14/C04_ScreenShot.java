package tests.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C04_ScreenShot extends TestBase {
    @Test
    public void screenTest() throws IOException {
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();

        TakesScreenshot tss=(TakesScreenshot) driver;
        File tumSayfaSS=new File("src\\tumSayfa.png");
        FileHandler.copy(tumSayfaSS, new File("src\\tumSayfa.png"));
       // WebElement logoElementi=driver.findElement(By.tagName("flnXdpd"));
       // File logoResmi=new File("src/logo.png");


    }
}
