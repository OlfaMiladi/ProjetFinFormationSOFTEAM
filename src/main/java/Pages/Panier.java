package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Panier {
    WebDriver driver;

    public Panier(WebDriver driver) {
        this.driver = driver;
    }

    public void verifiechampssubscribehere(String mail) {
        //verification subscribehere
        WebElement champssubscribe = driver.findElement(By.name("EMAIL"));
        champssubscribe.clear();
        champssubscribe.sendKeys(mail);

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

   /* public void verifierValeurQuantite() {
        //   l'element correspond au nombre total des produits dans le menu
        WebElement nbreArticle = driver.findElement(By.xpath("//span[@class='cartcontents']"));
        //     Cet élément correspond au nombre total des produits dans le tableau d'affichage
        WebElement quantiteAfficher = driver.findElement(By.name("cart[4c5bde74a8f110656874902f07378009][qty]"));
        WebElement quanite2Afficher=driver.findElement(By.name("cart[4c5bde74a8f110656874902f07378009][qty]"));
        // il recupere "le nombre + items" ex: "13 Items", et on veut que le nombre; donc on recupere le nmbre en utilisant
        // la méthode de séparation des textes en utilisant un tableau
        // il va recuperer la valeur de nbreArticle, et les séparer par un espace
        String[] s = nbreArticle.getText().split("\\s+");
        // cette methode permet de convrtir la premiere valeur dans le tableau du string en entier car
        // la methode utilisée accepte que les entiers
        int nbreArticleInt = Integer.parseInt(s[0]);
        // egalement cette methode permet de reconvertie la valeur de l'attribut value en entier
        int quantiteAfficherInt = Integer.parseInt(quantiteAfficher.getAttribute("value1"));
        int quantite2AfficherInt = Integer.parseInt(quanite2Afficher.getAttribute("value2"));
         int d = quantite2AfficherInt + quantiteAfficherInt;
        // application de la methode asserequals
        Assert.assertEquals(nbreArticleInt, d, "False");
    }

    // =======================  A vérifier avce le groupe ================================================================
   /* public void verifierToralPanier(){
        WebElement count = driver.findElement(By.className("woocommerce-Price-amount amount"));
        count.getText();
        Assert.assertTrue(count.isDisplayed());

   /* public void verifierPrixUnitaire(){
        WebElement prixArticlePanier = driver.findElement(By.className("woocommerce-Price-amount amount"));
        WebElement prixArticleshop = driver.findElement(By.className("woocommerce-Price-amount amount"));
        int prixArticlePanier = Integer.parseInt("");
        Assert.assertTrue(boolean prixArticleshop, b prixArticleshop,'false');

*/

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