package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;
//Yeni bir class olusturalim: D15_MouseActions4
public class C06_FacebookKayit extends TestBase {


    @Test
    public void test01() throws InterruptedException {

//1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//button[text()='Allow All Cookies']")).click();
//2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
//3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        WebElement isimKutusu= driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions=new Actions(driver);
        actions.click(isimKutusu).
                sendKeys("gazi").
                sendKeys(Keys.TAB).
                sendKeys("ayar").
                sendKeys(Keys.TAB).
                sendKeys("acavs@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("acavs@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("12qwasA").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("31").
                sendKeys(Keys.TAB).
                sendKeys("Oct").
                sendKeys(Keys.TAB).
                sendKeys("1987").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();



//4- Kaydol tusuna basalim













    }
}
