package Tests;

import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T16SouscriptionKO extends Hooks {



    @Test
    public void testVerifArticles(){
        ShopPages produit = new ShopPages(driver);
        produit.clickShop();
        produit.verifArticles();
    }

}
