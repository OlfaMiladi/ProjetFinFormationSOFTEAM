package Tests;

import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T44VerFiltreCateg extends Hooks {

    @Test
    public void testFiltre() {

        ShopPages produit = new ShopPages(driver);
        produit.clickShop();
        produit.affFiltreCategorie();

    }


}
