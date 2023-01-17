package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyAccountDetailPage {
    WebDriver driver;

    public MyAccountDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifiePresenceNom() {
        WebElement verefierNom = driver.findElement(By.name("coupon_code"));
        Assert.assertTrue( verefierNom.isDisplayed(), "Nom n'est pas présent");
    }
    public void VerifierChampsNom(String nom){
        WebElement champsNom = driver.findElement(By.name(""));
        champsNom.sendKeys(nom);
    }

    public void verifiePresencePrénom() {
        WebElement verefierPrénom = driver.findElement(By.name("coupon_code"));
        Assert.assertTrue( verefierPrénom.isDisplayed(), "Prénom n'est pas présent");
    }
    public void VerifierChampsPrénom(String prénom){
        WebElement champsPrénom = driver.findElement(By.name(""));
        champsPrénom.sendKeys(prénom);
    }
    public void verifiePresenceMail() {
        WebElement verefierMail = driver.findElement(By.name("coupon_code"));
        Assert.assertTrue( verefierMail.isDisplayed(), "Prénom n'est pas présent");
    }
    public void VerifierChampsMail(String mail){
        WebElement champsMail = driver.findElement(By.name(""));
        champsMail.sendKeys(mail);
    }

}
