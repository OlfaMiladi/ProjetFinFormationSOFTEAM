package Tests;

import Pages.ProductPage;
import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T46VerifDetails extends Hooks {

String article = "Android Quick Start Guide";
String prix = "450.00";
    @Test
    public void testDetails() {

        ShopPages produit = new ShopPages(driver);
        ProductPage prod = new ProductPage(driver);

        produit.clickShop();
        produit.verifArticles();
        produit.verifImageProduit();
        produit.verifTitreProduit(article);
        produit.verifPrixProduit();
        produit.clickTitreProduct(article);
        prod.affTitre(article);
        prod.affDetails();
        driver.navigate().back();
        produit.clickPrixProduct(prix);
        prod.affTitre(article);
        prod.affDetails();

    }
}
