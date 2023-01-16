package Tests;

import Pages.MyAccountPage;
import commun.Hooks;
import org.testng.annotations.Test;

public class RememberMe extends Hooks {

    String Val2 = "automaticiens@yopmail.com";
    String MPD ="Admin*2023";

    @Test

    public void  FonctionRememberme (){

        Pages.MyAccountPage CaseRememberMe = new MyAccountPage(driver);
        CaseRememberMe.CliqueMyaccount();
        CaseRememberMe.SaisirmailCo(Val2);
        CaseRememberMe.SaisirMDPCo(MPD);
        CaseRememberMe.FonctionRememberMe();
        CaseRememberMe.CliquerBoutonLogin();
        CaseRememberMe.Sedeconnecter();
        CaseRememberMe.Verifmailrempli();

    }
}
