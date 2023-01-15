package Tests;

import Pages.MyAccountPage;
import Pages.Shop;
import commun.Hooks;
import org.testng.annotations.Test;

public class TestAjoutArticles extends Hooks {

    String Val2 = "olfa.benameur@gmail.com";
    String MPD ="olfa1234/";


@Test
    public void testajout() {

    MyAccountPage accountConec = new MyAccountPage(driver);

    Shop produit = new Shop(driver);

    accountConec.CliqueMyaccount();
    accountConec.SaisirmailCo(Val2);
    accountConec.SaisirMDPCo(MPD);
    accountConec.CliquerBoutonLogin();
    produit.clickshop();
    produit.afffiltrecategorie();
    produit.afffiltreprice();
    produit.clickaddbasket();
    //produit.affviewbasket();
    produit.clickviewbasket();
    driver.navigate().back();
    produit.clickreadmore();
    produit.affoutstock();
    produit.clickiconebasket();
    produit.affpanier();












    }
}
