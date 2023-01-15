package Tests;

import Pages.MyAccountPage;
import Pages.Product;
import Pages.Shop;
import commun.Hooks;
import org.testng.annotations.Test;

public class TestVerifProduct extends Hooks {
    String Val2 = "olfa.benameur@gmail.com";
    String MPD ="olfa1234/";

    String nbex = "22";

    @Test
    public void testVerifA(){
        MyAccountPage accountConec = new MyAccountPage(driver);

        Shop produit = new Shop(driver);

        Product prod = new Product(driver);


        accountConec.CliqueMyaccount();
        accountConec.SaisirmailCo(Val2);
        accountConec.SaisirMDPCo(MPD);
        accountConec.CliquerBoutonLogin();
        produit.clickShop();
        produit.clickProduct();
        prod.affImage();
        prod.affTitre();
        prod.affDetails();
        prod.affPrix();
        prod.affNbreExemplaire();
        prod.clickAddBouton();
        prod.affMessAddBasket();
        prod.saisirNbreExVoulu(nbex);



    }




}
