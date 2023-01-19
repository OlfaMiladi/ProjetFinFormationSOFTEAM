package Tests;

import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T31VerOutstock extends Hooks {
String article ="Functional Programming in JS";
    @Test
    public void testOutOfStock(){
        ShopPages produit = new ShopPages(driver);

        produit.clickShop();
        produit.clickReadMore(article);
        produit.affOutStock();

    }
}
