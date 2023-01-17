package Tests;

import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T43VerFiltrePrix extends Hooks {

    @Test
    public void testPrix() {

        ShopPages produit = new ShopPages(driver);
        produit.clickShop();
        produit.affFiltrePrice();

    }
}
