package Tests;

import commun.Hooks;
import org.testng.annotations.Test;
import Pages.MyAccountPage;

public class ConnexionKo extends Hooks {
    String Val2 = "automaticiens@yopmail.com";
    String MPD ="Admin*2017";

    @Test
    public void  testconnKo () {

        MyAccountPage accountConec = new MyAccountPage(driver);
        accountConec.CliqueMyaccount();
        accountConec.SaisirmailCo(Val2);
        accountConec.SaisirMDPCo(MPD);
        accountConec.CliquerBoutonLogin();

        MyAccountPage Errormsg = new MyAccountPage(driver);
        Errormsg.VerifMsgError();
    }

}
