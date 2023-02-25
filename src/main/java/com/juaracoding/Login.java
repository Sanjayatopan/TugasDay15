package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://shop.demoqa.com/my-account/");
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        String titleHeader = driver.getTitle();
        System.out.println("Title Header :"+titleHeader);

        driver.findElements(By.id("Login"));

        driver.findElement(By.id("username")).sendKeys("sanjayatopan23");
        driver.findElement(By.id("password")).sendKeys("JC1@x111xzxx");

        js.executeScript("window.scrollBy(0, 500)"); //scroll by pixel vertical
        driver.findElement(By.id("customer_login")).click();
        System.out.println("Berhasil Login");

        System.out.println("Delay 3 seconds");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Quit Browser");

    }
}
