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
        WebElement verefierNom = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form/p[1]/label"));
        Assert.assertTrue( verefierNom.isDisplayed(), "Nom n'est pas présent");
    }
    public void VerifierChampsNom(){
        WebElement champsNom = driver.findElement(By.name("account_first_name"));
        String name = champsNom.getAttribute("XXXX");
      }

    public void verifiePresencePrénom() {
        WebElement verefierPrénom = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form/p[2]/label"));
        Assert.assertTrue( verefierPrénom.isDisplayed(), "Prénom n'est pas présent");
    }
    public void VerifierChampsPrénom(){
        WebElement champsPrénom = driver.findElement(By.id("account_last_name"));
        String prénom= champsPrénom.getAttribute("YYYY");
    }
    public void verifiePresenceMail() {
        WebElement verefierMail = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form/p[3]/label"));
        Assert.assertTrue( verefierMail.isDisplayed(), "Prénom n'est pas présent");
    }
    public void VerifierChampsMail(){
        WebElement champsMail = driver.findElement(By.id("account_email"));
        String Mail = champsMail.getAttribute("Softeam17@yopmail.com");
    }

}
