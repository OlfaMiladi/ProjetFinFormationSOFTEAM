package Tests;

import Pages.MyAccountPage;
import Pages.PanierPage;
import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T38SubscribeAccount extends Hooks {
    String Val2 = "Softeam17@yopmail.com";
    String MPD ="Softeam@1";


    // VERIFIER la présence de boutton "subscribe here " dans page Panier
    @Test
    public void testVerifierSubscrireIci(){
        MyAccountPage accountConec = new MyAccountPage(driver);
        MyAccountPage subscribe = new MyAccountPage(driver);
        ShopPages produit = new ShopPages(driver);
        PanierPage monpanier = new PanierPage(driver);
        accountConec.CliqueMyaccount();
        accountConec.SaisirmailCo(Val2);
        accountConec.SaisirMDPCo(MPD);
        accountConec.CliquerBoutonLogin();
        subscribe.CliqueMyaccount();
        produit.verifTitreSouscribe();
        produit.verifChampSouscribe();
        produit.verifBoutonSouscribe();


    }
}
