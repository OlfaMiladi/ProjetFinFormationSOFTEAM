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
        Accueil.Logoclick();
        driver.navigate().back();

        MyAccountDetailPage DetailPage = new MyAccountDetailPage(driver);
        Account.SaisirmailCo(Val2);
        Account.SaisirMDPCo(MPD);
        Account.CliquerBoutonLogin();
        Account.AccountDetailsPage();
        Accueil.VerifLogo();
        Accueil.Logoclick();
        driver.navigate().back();

        ShopPages Shop = new ShopPages(driver);
        Shop.clickShop();
        Accueil.VerifLogo();
        Accueil.Logoclick();
        driver.navigate().back();

        PanierPage Pnier = new PanierPage(driver);
        Shop.clickIconeBasket();
        Pnier.affPanier();
        Accueil.VerifLogo();
        Accueil.Logoclick();

    }
}
