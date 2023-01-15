package Tests;

import Pages.MyAccountPage;
import Pages.Panier;
import Pages.Shop;
import commun.Hooks;
import org.testng.annotations.Test;

public class Test39 extends Hooks {

    String Val2 = "Softeam17@yopmail.com";
    String MPD ="Softeam@1";


    // VERIFIER la présence de boutton "subscribe here " dans page Panier
    @Test
    public void testVerifierSubscrireIci (){
        MyAccountPage accountConec = new MyAccountPage(driver);

        Shop produit = new Shop(driver);

        accountConec.CliqueMyaccount();
        accountConec.SaisirmailCo(Val2);
        accountConec.SaisirMDPCo(MPD);
        accountConec.CliquerBoutonLogin();
        produit.clickshop();
        produit.clickaddbasket();
        //produit.affviewbasket();
        produit.clickviewbasket();
        Panier monpanier = new Panier(driver);
        monpanier.verifiechampssubscribehere("Softeam17@yopmail.com");
    }

}
