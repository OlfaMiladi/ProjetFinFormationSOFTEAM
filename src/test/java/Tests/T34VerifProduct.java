package Tests;

import Pages.MyAccountPage;
import Pages.Panier;
import Pages.ProductPage;
import Pages.ShopPages;
import commun.Hooks;
import org.testng.annotations.Test;

//cas de test .....

public class T34VerifProduct extends Hooks {
    //String Val2 = "olfa.benameur@gmail.com";
    //String MPD ="olfa1234/";

    String nbex = "22";
    String article = "HTML5 WebApp Develpment";

    @Test
    public void testVerifA(){
        MyAccountPage accountConec = new MyAccountPage(driver);

        ShopPages produit = new ShopPages(driver);

        ProductPage prod = new ProductPage(driver);

        Panier basket = new Panier(driver);


        //accountConec.CliqueMyaccount();
        //accountConec.SaisirmailCo(Val2);
        //accountConec.SaisirMDPCo(MPD);
        //accountConec.CliquerBoutonLogin();

        produit.clickShop();
        produit.clickTitreProduct(article);
        prod.affTitre(article);
        prod.affPrix();
        prod.affDetails();
        prod.affNbreExemplaire();
        prod.saisirNbreExVoulu(nbex);
        prod.clickAddBouton();
        prod.affMessAddBasket();
        prod.clickViewBasketProduct();
        basket.affPanier();






    }




}
