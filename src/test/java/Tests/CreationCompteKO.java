package Tests;

import commun.Hooks;
import org.testng.annotations.Test;
import pages.MyAccountPage;

import java.sql.Driver;

public class CreationCompteKO extends Hooks {

    String email2 = "automaticienSofteam@yopmail.com";
    String pword2 ="adminadmin";

    @Test
    public void  testconnKo (){

        MyAccountPage accountKo = new MyAccountPage(driver);

        accountKo.CliqueMyaccount();
        accountKo.Saisirmail(email2);
        accountKo.SaisirMDP(pword2);
        accountKo.CliquerBoutonResgister();
    }
    //faire une capture d'écran
}
