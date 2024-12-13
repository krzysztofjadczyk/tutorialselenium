import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {

    @Test
    public void findElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //po id?
        driver.findElement(By.cssSelector("#clickOnMe"));

        //po class
        driver.findElement(By.cssSelector(".topSecret"));

        //po tag name
        driver.findElement(By.cssSelector("input")).sendKeys("Pierwszy");

        //po name
        driver.findElements(By.cssSelector("[name='fname']"));
        driver.findElements(By.cssSelector("[class='topSecret']"));

        driver.quit();
    }
}
