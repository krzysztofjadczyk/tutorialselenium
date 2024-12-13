import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class SeleniumTest {


    @Test
    public void openGooglePage(){
       // WebDriver driver = new InternetExplorerDriver();
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        // Dimension windowSize = new Dimension(1200, 1200);
        // driver.manage().window().setSize(windowSize);
        driver.get("https://google.com");

        //JavascriptExecutor executor = (JavascriptExecutor) driver;
        //executor.executeScript("window.open('https://www.google.com','blank','height=200,width=200')");

        //driver.quit(); //zamyka wszystkie okna
        //driver.close(); //zamyka pierwotne okno

        //; // przechodzimy do okienka z plikami cookie
        //WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko')]"));
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        agreeButton.click();
        driver.switchTo().defaultContent();
        //znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        //wprowadź wartość Selenium do pola
        searchField.sendKeys("Selenium");
        //zasymuluj naciśnięcie przycisku Enter
        searchField.sendKeys(Keys.ENTER);
        //sprawdzenie rezultatu czy zawiera selenium.dev
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));

        WebElement graphResult = driver.findElement(By.cssSelector(".YmvwI"));

        Assert.assertTrue(result.isDisplayed());
        Assert.assertTrue(graphResult.isDisplayed());
    }

    public WebDriver getDriver(String browser) {
        if (browser == "chrome") {
            return new ChromeDriver();
        } else if (browser == "firefox") {
            return new FirefoxDriver();
        } else if (browser == "ie") {
            return new InternetExplorerDriver();
        } else throw new IllegalArgumentException("Invalid browser name");

        //switch (browser) {
        // case "chrome":
        // return new ChromeDriver();
        // case "firefox":
        // return new FirefoxDriver();
        // case "ie":
        // return new InternetExplorerDriver();
        // default:
        // throw new IllegalArgumentException();
    }
}
