import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {

    @Test
    public void findElement() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //lokalizowanie elementu po id
        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);
        //driver.findElement(By.id("clickOnMe")).click();

        //lokalizowanie elementu po atrybucie name
        By firstName = By.name("fname");
        WebElement firstNameInput = driver.findElement(firstName);
        // driver.findElement(By.name("fname"));

        //lokalizowanie elmentu po wartości atrybutu class
        driver.findElement(By.className("topSecret"));

        //lokalizowanie elementu po tagu
        driver.findElement(By.tagName("input")).sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(By.tagName("input")); //zwróci wszystkiei nputy na stronie
        System.out.println(inputs.size());

        //lokalizowanie elementów typu link
        driver.findElement(By.linkText("Visit W3Schools.com!"));
        driver.findElement(By.partialLinkText("Schools")).click();

        //lokalizowanie elementów za pomocą css


        //Assert.assertTrue();
    }
}
