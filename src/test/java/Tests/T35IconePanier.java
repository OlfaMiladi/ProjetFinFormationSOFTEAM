package Tests;

import Pages.*;
import commun.Hooks;
import org.testng.annotations.Test;

public class T35IconePanier extends Hooks {
    String Val2 = "automaticiens@yopmail.com";
    String MPD ="Admin*2023";

    @Test
    public void  IconePanier (){

        AccueilPage AccueilPanier = new AccueilPage(driver);
        MyAccountPage AccountPanier = new MyAccountPage(driver);
        ShopPages ShopPanier = new ShopPages(driver);
        PanierPage Pnier = new PanierPage(driver);
        ShopPanier.clickIconeBasket();
        AccountPanier.CliqueMyaccount();
        AccountPanier.SaisirmailCo(Val2);
        AccountPanier.SaisirMDPCo(MPD);
        AccountPanier.CliquerBoutonLogin();
        ShopPanier.clickIconeBasket();
        Pnier.affPanier();
        ShopPanier.clickIconeBasket();
    }
}
