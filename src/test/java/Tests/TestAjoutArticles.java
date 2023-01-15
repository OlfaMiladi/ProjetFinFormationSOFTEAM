package Tests;

import Pages.MyAccountPage;
import Pages.Shop;
import commun.Hooks;
import org.testng.annotations.Test;

public class TestAjoutArticles extends Hooks {

    String Val2 = "olfa.benameur@gmail.com";
    String MPD ="olfa1234/";

    String mail = "olfa@yopmailcom";


@Test
    public void testAjoutA() {

    MyAccountPage accountConec = new MyAccountPage(driver);

    Shop produit = new Shop(driver);


    accountConec.CliqueMyaccount();
    accountConec.SaisirmailCo(Val2);
    accountConec.SaisirMDPCo(MPD);
    accountConec.CliquerBoutonLogin();
    produit.clickShop();
    produit.affFiltreCategorie();
    produit.affFiltrePrice();
    produit.clickAddBasket();
    //produit.affviewbasket();
    produit.clickViewBasket();
    driver.navigate().back();
    produit.clickReadMore();
    produit.affOutStock();
    produit.clickIconeBasket();
    produit.affPanier();
    produit.clickShop();
    produit.saisirSubscribe(mail);
    produit.clickSubscribe();













    }
}
