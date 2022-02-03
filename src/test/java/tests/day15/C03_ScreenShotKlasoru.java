package tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.IOException;

public class C03_ScreenShotKlasoru extends TestBase {
    WebElement aramaKutusu;

    @Test
    public void test01() throws IOException {
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java" + Keys.ENTER);
        tumSayfaScreenshot();

    }
@Test
    public void test02() throws IOException {


        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("nutella" + Keys.ENTER);
        tumSayfaScreenshot();

    }
@Test
    public void test03() throws IOException {

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("elma" + Keys.ENTER);
        tumSayfaScreenshot();
    }
}