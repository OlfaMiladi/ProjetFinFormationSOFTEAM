package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    //affichage details produit

    public void affDetails() {
        WebElement details = driver.findElement(By.xpath("//*[contains(text(), 'Product Description')]"));
        Assert.assertTrue(details.isDisplayed(), "Details non affiché");
    }
    //affichage prix produit

    public void affPrix() {
        //WebElement prix = driver.findElement(By.xpath("//*[contains(text(), '180.00')]"));
        WebElement prix = driver.findElement(By.className("price"));
        Assert.assertTrue(prix.isDisplayed(), "Prix non affiché");
    }


    //affichage titre produit


    public void affTitre(String article) {
       WebElement titre =  driver.findElement(By.xpath("//h1[@itemprop='name'][contains(.,'" +article+ "')]"));
        Assert.assertTrue(titre.isDisplayed(), "Titre non affiché");
    }


    //affichage nombre d'exemplaire produit

    public void affNbreExemplaire() {
        WebElement nombre = driver.findElement(By.xpath("//*[contains(text(), 'in stock')]"));
        Assert.assertTrue(nombre.isDisplayed(), "Prix non affiché");

    }

    public void clickAddBouton(){

        WebElement btClickAdd = driver.findElement(By.className("single_add_to_cart_button"));
        btClickAdd.click();

    }
    //affichage du message "has been added to your basket"
    public void affMessAddBasket() {

        WebElement image = driver.findElement(By.xpath("//*[contains(text(),'have been added to your basket')]"));

        Assert.assertTrue(image.isDisplayed(), "Message non affiché");

    }

    //saisir nombre d'exemplaire voulu

    public void saisirNbreExVoulu(String nbex){
        WebElement nombreExemplaire = driver.findElement(By.xpath("//input[@class='input-text qty text']"));
        nombreExemplaire.clear();
        nombreExemplaire.sendKeys(nbex);
    }

    public void clickViewBasketProduct() {
        WebElement btClickView = driver.findElement(By.xpath("//a[@class='button wc-forward']"));
        btClickView.click();
    }

    }
