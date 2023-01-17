package Tests;

import Pages.Panier;
import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T32VerInStock extends Hooks {

    @Test
    public void testStock() {

        ShopPages produit = new ShopPages(driver);
        Panier pan = new Panier(driver);

        produit.clickShop();
        produit.clickAddBasket1();
        produit.affViewBasket();
        produit.clickViewBasket();
        pan.affPanier();


    }
}
