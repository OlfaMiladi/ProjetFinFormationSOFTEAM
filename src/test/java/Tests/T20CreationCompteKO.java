package Tests;

import commun.Hooks;
import org.testng.annotations.Test;
import Pages.MyAccountPage;

public class T20CreationCompteKO extends Hooks {

    String email2 = "g17softeam7@yopmail.com";
    String pword2 ="olfa1234/";

    @Test
    public void  testcreaKo (){

        MyAccountPage accountKo = new MyAccountPage(driver);

        accountKo.CliqueMyaccount();
        accountKo.Saisirmail(email2);
        accountKo.SaisirMDP(pword2);
        accountKo.CliquerBoutonResgister();
    }
    //faire une capture d'écran
}
