import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchVynoTeka {
    @Test
    public void SearchTypeClick() {

        System.setProperty("webdriver.chrome.driver", "C:\\kelias\\iki\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.vynoteka.lt");


        // WebElement searchBox = driver.findElement(By.id("search"));
        // searchBox.sendKeys("vynas");















    }

}




























