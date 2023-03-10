package Tests;

import Pages.MyAccountPage;
import Pages.PanierPage;

import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T39SubscribePanier extends Hooks {

    String Val2 = "Softeam17@yopmail.com";
    String MPD ="Softeam@1";


    // VERIFIER la présence de boutton "subscribe here " dans page Panier
    @Test
    public void testVerifierSubscrireIci (){
        MyAccountPage accountConec = new MyAccountPage(driver);

        ShopPages produit = new ShopPages(driver);

        accountConec.CliqueMyaccount();
        accountConec.SaisirmailCo(Val2);
        accountConec.SaisirMDPCo(MPD);
        accountConec.CliquerBoutonLogin();
        produit.clickShop();
        produit.clickAddBasket1();
        produit.clickViewBasket();
        produit.verifTitreSouscribe();
        produit.verifChampSouscribe();
        produit.verifBoutonSouscribe();


    }

}
