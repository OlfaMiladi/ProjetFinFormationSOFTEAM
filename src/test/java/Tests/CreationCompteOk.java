package Tests;

import commun.Hooks;
import org.testng.annotations.Test;
import pages.MyAccountPage;

public class CreationCompteOk extends Hooks {

    String email = "automaticienteam@yopmail.com";
    String pword ="Admin*admin2023";

    @Test
    public void  testconnOk (){

        MyAccountPage account = new MyAccountPage(driver);

        account.CliqueMyaccount();
        account.Saisirmail(email);
        account.SaisirMDP(pword);
        account.CliquerBoutonResgister();
    }
}