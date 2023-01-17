package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccueilPage {
    WebDriver driver;

    public AccueilPage (WebDriver driver) {
        this.driver = driver;
    }

    // Verification du logo

    public void VerifLogo(){


        WebElement Logocliquable = driver.findElement(By.id("site-logo"));
        Logocliquable.isEnabled();

    }


}
