package Tests;

import Pages.MyAccountPage;
import Pages.PanierPage;
import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class T30VerificationPanier extends Hooks {
    String Val2 = "Softeam17@yopmail.com";
    String MPD = "Softeam@1";

    @Test
    public void consultationpanier() {
        MyAccountPage accountConec = new MyAccountPage(driver);
        ShopPages produit = new ShopPages(driver);
        PanierPage monproduit = new PanierPage(driver);
        accountConec.CliqueMyaccount();
        accountConec.SaisirmailCo(Val2);
        accountConec.SaisirMDPCo(MPD);
        accountConec.CliquerBoutonLogin();
        produit.clickShop();
        produit.clickAddBasket2();
        produit.clickAddBasket1();
        produit.clickViewBasket();
       monproduit.AjouterArticle2Panier("13");
       monproduit.AjouterArticlePanier("14");
       monproduit.verifiePresenceChampsCoupon("12365");
       monproduit.verifiePresenceTitleCoupon();
       monproduit.verifiePresencePrix();
       monproduit.verifiePresenceTotal();
       monproduit.verifiePresencequantite();
       monproduit.verifieTaxes();
       monproduit.verifieTotalCommande();
        monproduit.suprimeArticle();
        monproduit.verifieBouttonCheckout();


    }
}
