package Tests;


import Pages.*;
import commun.Hooks;
import org.testng.annotations.Test;

public class T19Logocliquable extends Hooks {

    String Val2 = "automaticiens@yopmail.com";
    String MPD ="Admin*2023";

    @Test
    public void  Logocliquable (){

        AccueilPage Accueil = new AccueilPage(driver);
        Accueil.VerifLogo();
        MyAccountPage Account = new MyAccountPage(driver);
        Account.CliqueMyaccount();
        Accueil.VerifLogo();

        MyAccountDetailPage DetailPage = new MyAccountDetailPage(driver);
        Account.SaisirmailCo(Val2);
        Account.SaisirMDPCo(MPD);
        Account.CliquerBoutonLogin();
        Account.AccountDetailsPage();
        Accueil.VerifLogo();

        ShopPages Shop = new ShopPages(driver);
        Shop.clickShop();
        Accueil.VerifLogo();
        Shop.clickAddBasket1();

        Panier Pnier = new Panier(driver);
        Shop.clickViewBasket();
        Pnier.affPanier();
        Accueil.VerifLogo();

       /*ProductPage Product = new ProductPage(driver);
        Product.affDetails();
        Accueil.VerifLogo();*/
    }
}
