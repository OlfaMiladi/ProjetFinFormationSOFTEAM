package Tests;

import Pages.Panier;
import Pages.ProductPage;
import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T46VerifDetails extends Hooks {

String article = "Android Quick Start Guide";
    @Test
    public void testDetails() {

        ShopPages produit = new ShopPages(driver);
        ProductPage prod = new ProductPage(driver);

        produit.clickShop();
        produit.clickProduct(article);

        //produit.clickImageProduit();
        prod.affTitre();
        //prod.affImage();
        prod.affDetails();
        prod.affPrix();


        //produit.clickTitreProduit();


    }
}
