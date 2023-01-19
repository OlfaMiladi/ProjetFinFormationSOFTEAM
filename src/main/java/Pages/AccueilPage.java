package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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

    public void Logoclick(){


        WebElement Logocliquable = driver.findElement(By.id("site-logo"));
        Logocliquable.click();

    }

    //Verification de la page d'accueil

    public void VerifPageAccueil(){


        WebElement PageAccueil = driver.findElement(By.xpath("*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[1]/div[2]"));
        Assert.assertTrue(PageAccueil.isDisplayed(), "La page d'accueil n'est pas affichée");

        //PageAccueil.isDisplayed();
    }


}
