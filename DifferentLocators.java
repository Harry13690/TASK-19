package task_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DifferentLocators {

    public static void main(String[] args) {

        //Creating an Instance for ChromeDriver
        WebDriver driver = new ChromeDriver();

        //Declaring Implicit wait(10 seconds)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximizing the Window
        driver.manage().window().maximize();

        //Navigating to the Given URL
        driver.get("https://www.guvi.in/register");

        //Finding the Web Element by Id Locator
        driver.findElement(By.id("name"));

        //Finding the Web Element by ClassName Locator
        driver.findElement(By.className("form-control"));

        //Finding the Web Element by TagName Locator
        driver.findElement(By.tagName("input"));

        //Finding the Web Element by CSS Selector
        driver.findElement(By.cssSelector("input[id='mobileNumber']"));

        //Finding the Web Element by LinkText
        driver.findElement(By.linkText("Login"));

        //Finding the Web Element by X-Path
        driver.findElement(By.xpath("//input[@class='form-control']"));

        //Finding the Web Element by X-Path Using Contains Method
        driver.findElement(By.xpath("//p[contains(text(),'Sign Up')]"));

        //Finding the Web Element by X-Path Using Starts with Method
        driver.findElement(By.xpath("//a[starts-with(@class,'btn')]"));

        //Finding the Web Element by X-Path Using Parent Tag
        driver.findElement(By.xpath("//div[@class='sub-head']//ul"));

        System.out.println("All Locators are Working Fine");
    }
}
