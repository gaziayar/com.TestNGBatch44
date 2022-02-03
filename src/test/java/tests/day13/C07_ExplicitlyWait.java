package tests.day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C07_ExplicitlyWait extends TestBase {
    public void test01(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));

    }
}
