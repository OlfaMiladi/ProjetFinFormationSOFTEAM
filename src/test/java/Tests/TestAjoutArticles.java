package Tests;

import Pages.MyAccountPage;
import Pages.Panier;
import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

public class TestAjoutArticles extends Hooks {

    String Val2 = "olfa.benameur@gmail.com";
    String MPD ="olfa1234/";

    String mail = "olfa@yopmailcom";


@Test
    public void testAjoutA() {

    //MyAccountPage accountConec = new MyAccountPage(driver);

    ShopPages produit = new ShopPages(driver);
    Panier pan = new Panier(driver);


    //accountConec.CliqueMyaccount();
    //accountConec.SaisirmailCo(Val2);
    //accountConec.SaisirMDPCo(MPD);
    //accountConec.CliquerBoutonLogin();
    produit.clickShop();
    produit.affFiltreCategorie();
    produit.affFiltrePrice();
    produit.clickReadMore();
    produit.affOutStock();
    driver.navigate().back();
    produit.clickAddBasket2();
    produit.clickAddBasket1();
    produit.clickViewBasket();
    pan.affPanier();

    produit.clickIconeBasket();
    pan.affPanier();

    produit.clickShop();
    
    //produit.saisirSubscribe(mail);
    //produit.clickSubscribe();













    }
}
