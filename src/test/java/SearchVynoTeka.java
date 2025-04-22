import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchVynoTeka {
    @Test
    public void SearchTypeClick() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Nustatome laukimo laika
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://Vynoteka.lt");












    }

}




























