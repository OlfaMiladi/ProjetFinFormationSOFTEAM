package Tests;

import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T16SouscriptionKO extends Hooks {

String mail="olfa.benameur@com";

    @Test
    public void testSouscriptionKO(){
        ShopPages produit = new ShopPages(driver);
        produit.verifTitreSouscribe();
        produit.verifChampSouscribe();
        produit.saisirSubscribe(mail);
        produit.clickSubscribe();
        produit.affMessErreur();


    }


}
