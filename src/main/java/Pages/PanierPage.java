package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PanierPage {
    WebDriver driver;

    public PanierPage(WebDriver driver) {
        this.driver = driver;
    }



    public void verificationrecapitulatif() {
        // V&rification la présence du titre "Basket Totals"
        String originetitre = "Basket Totals";
        String expectedtitr = "Basket Totals";
        WebElement recapitulatif = driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/h2"));
        Assert.assertEquals(expectedtitr, originetitre, "false");
    }

    public void verifierTitreQuantite() {
        WebElement titreQuantite = driver.findElement(By.className("product-quantity"));
        Assert.assertTrue(titreQuantite.isDisplayed(), "quantity n'est pas affiché");
    }

    // A vérifier avec le groupe
    public void AjouterArticlePanier( String nbr2){
        WebElement quantite = driver.findElement(By.name("cart[4c5bde74a8f110656874902f07378009][qty]"));
        quantite.clear();
        quantite.sendKeys(nbr2);
    }
    public void AjouterArticle2Panier( String nbr){
        WebElement quantite = driver.findElement(By.name("cart[9766527f2b5d3e95d4a733fcfb77bd7e][qty]"));
        quantite.clear();
        quantite.sendKeys(nbr);
    }



    // ================================================================================================================================
    public void suprimeArticle() {
        WebElement suprimeboutton = driver.findElement(By.className("remove"));
        suprimeboutton.click();

    }

    public void verifiePresencePrix(){
        WebElement presencePrix = driver.findElement(By.className("product-price"));
        Assert.assertTrue(presencePrix.isDisplayed(), "prix n'est pas affiché");

    }
    public void verifiePresenceTotal(){
        WebElement presencePrixTotal = driver.findElement(By.className("product-price"));
        Assert.assertTrue(presencePrixTotal.isDisplayed(), "total n'est pas affiché");

    }

    public void verifieTaxes(){
        WebElement presenceTaxes = driver.findElement(By.className("tax-rate tax-rate-in-tax-1"));
        Assert.assertTrue(presenceTaxes.isDisplayed(), "total n'est pas affiché");

    }

    public void verifieTotalCommande(){
        WebElement presenceTotalcommande = driver.findElement(By.className("order-total"));
        Assert.assertTrue(presenceTotalcommande.isDisplayed(), "total commande n'est pas affiché");

    }

    public void verifiePresencequantite(){
        WebElement Presencequantite = driver.findElement(By.className("product-quantity"));
        Assert.assertTrue(Presencequantite.isDisplayed(), "quantite n'est pas affiché");
    }

    public void verifiePresenceChampsCoupon(String coupon){
        WebElement champsCoupon = driver.findElement(By.name("coupon_code"));
        champsCoupon.sendKeys(coupon);

    }
    public void verifiePresenceTitleCoupon() {
        WebElement titleCoupon = driver.findElement(By.name("coupon_code"));
        Assert.assertTrue(titleCoupon.isDisplayed(), "Coupon n'est pas affiché");
    }
        public void verifieBouttonCheckout(){
            WebElement BouttonBasket = driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div[2]/div/div/a"));
            BouttonBasket.click();
}
    public void affPanier(){
        WebElement mess = driver.findElement(By.xpath("//*[contains(text(), 'Basket Totals')]"));
        Assert.assertTrue(mess.isDisplayed(), "Message non affiché");

    }


}