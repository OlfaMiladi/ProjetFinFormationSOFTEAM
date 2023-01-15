package Tests;

import Pages.MyAccountPage;
import Pages.Panier;
import Pages.Shop;
import commun.Hooks;
import org.testng.annotations.Test;

public class Test30 extends Hooks {
    String Val2 = "Softeam17@yopmail.com";
    String MPD = "Softeam@1";

    @Test
    public void consultationpanier() {
        MyAccountPage accountConec = new MyAccountPage(driver);
        Shop produit = new Shop(driver);
        accountConec.CliqueMyaccount();
        accountConec.SaisirmailCo(Val2);
        accountConec.SaisirMDPCo(MPD);
        accountConec.CliquerBoutonLogin();
        produit.clickshop();
        produit.clickaddbasket();
        produit.clickaddbasket();
        produit.clickviewbasket();
        Panier monproduit = new Panier(driver);
        monproduit.verificationrecapitulatif();
        monproduit.verifierTitreQuantite();
        monproduit.verifierValeurQuantite();

       monproduit.verifiePresenceChampsCoupon("12365");
       monproduit.verifiePresenceTitleCoupon();
       // Ajouter deux articles différents pour faire cette action de suppression d'article
//       monproduit.suprimeArticle();
//       monproduit.AjouterArticlePanier();
        monproduit.verifieBouttonCheckout();

    }
}
