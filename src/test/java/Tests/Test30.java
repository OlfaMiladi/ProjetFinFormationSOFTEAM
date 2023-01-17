package Tests;

import Pages.MyAccountPage;
import Pages.Panier;
import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class Test30 extends Hooks {
    String Val2 = "Softeam17@yopmail.com";
    String MPD = "Softeam@1";

    @Test
    public void consultationpanier() {
        MyAccountPage accountConec = new MyAccountPage(driver);
        ShopPages produit = new ShopPages(driver);
        Panier monproduit = new Panier(driver);
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
        monproduit.suprimeArticle();
        monproduit.verifieBouttonCheckout();

    }
}
