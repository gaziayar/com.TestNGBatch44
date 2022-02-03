package tests.day08;

import org.testng.annotations.Test;

public class C01_Notaions {
    @Test(priority = -9)
    public  void youtubeTest(){
        System.out.println("youtube testi calisti");


    }

    @Test // (priority = 8) prority atanmazsa prority 0 kabul eder
    public  void amazonTest(){
        System.out.println("amazon testi calisti");


    }

    @Test   // (priority = 5)
    public  void bestbuyTest(){
        System.out.println("bestbuy testi calisti");


    }
}
