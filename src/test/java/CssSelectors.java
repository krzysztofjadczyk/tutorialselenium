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

        driver.findElement(By.cssSelector("*")); //zwraca wszystkie tagi ze strony

        //zwraca listy wewnątrz div
        driver.findElement(By.cssSelector("div ul"));

        //szukamy tr w całym table
        driver.findElement(By.cssSelector("table tr"));

        //zwraca tylko tr wewnątrz tbody
        driver.findElement(By.cssSelector("tbody tr"));

        //zwraca pierwszy element (dziecko) w div
        driver.findElement(By.cssSelector("div > ul"));

        //zwraca pierwszy ul (dziecko) w tbody
        driver.findElements(By.cssSelector("tbody > ul"));

        //first form after label
        driver.findElement(By.cssSelector("label + form"));

        //all forms after label
        driver.findElement(By.cssSelector("label ~ form"));

        //wyszukiwanie elementów po nazwie atrybuty
        By attrTag = By.cssSelector("input[name='fname']");
        By attContains = By.cssSelector("[name*='name']");
        By attStarts = By.cssSelector("[name^='f']");
        By attEnds = By.cssSelector("[name$='name']");

        driver.findElement(attrTag);
        driver.findElement(attContains);
        driver.findElement(attStarts);
        driver.findElement(attEnds);

        //wyszukiwanie dzieci tagu nadrzędnego
        By firstChild = By.cssSelector("li:first-child");
        By secondChild = By.cssSelector("li:last-child");
        By thirdChild = By.cssSelector("li:nth-child(3)");

        driver.findElement(firstChild);
        driver.findElement(secondChild);
        driver.findElement(thirdChild);


        //zamykanie przeglądarki
        driver.quit();
    }
}
