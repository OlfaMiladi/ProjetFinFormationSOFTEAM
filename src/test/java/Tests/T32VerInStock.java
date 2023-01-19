package Tests;

import Pages.PanierPage;
import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T32VerInStock extends Hooks {

    @Test
    public void testStock() {

        ShopPages produit = new ShopPages(driver);
        PanierPage pan = new PanierPage(driver);

        produit.clickShop();
        produit.clickAddBasket1();
        produit.affViewBasket();
        produit.clickViewBasket();
        pan.affPanier();


    }
}
