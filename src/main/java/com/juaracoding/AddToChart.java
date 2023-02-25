package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToChart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://shop.demoqa.com/product/pink-drop-shoulder-oversized-t-shirt/");
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        String titleHeader = driver.getTitle();
        System.out.println("Title Header :" + titleHeader);

        WebElement selectColor = driver.findElement(By.id("pa_color"));
        Select color = new Select(selectColor);

        color.selectByVisibleText("Pink");
        System.out.println("Test Select Pink Success");

        WebElement selectSize = driver.findElement(By.id("pa_size"));
        Select size = new Select(selectSize);

        size.selectByVisibleText("36");
        System.out.println("Test Select 36 Success");

        js.executeScript("window.scrollBy(0, 500)"); //scroll by pixel vertical
        driver.findElement(By.id("product-1497")).click();
        System.out.println("Success Add To Chart");

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
