import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

import static java.awt.SystemColor.control;
import static org.openqa.selenium.By.*;

public class SearchVynoTeka {
    @Test
    public void SearchTypeClick() {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("https://www.vynoteka.lt");

        WebElement acceptBtn = driver.findElement(className("c-button--blue"));
        acceptBtn.click();
        driver.findElement(xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();

        wait.until(ExpectedConditions.elementToBeClickable(xpath("/html/body/div[4]/div[1]/div/div[2]/div[2]/div[2]/button/div"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(className("search-form__content--desktop")));


        driver.findElement(By.xpath("//*[@id=\"app__header\"]/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input")).sendKeys("alus");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app__header\"]/div[2]/div/div/div[3]/div/div/div/form/div[2]/div/div[2]")));
        driver.findElement(xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button")).click();
    }
}


















































































