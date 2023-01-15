package Tests;

import commun.Hooks;
import org.testng.annotations.Test;
import Pages.MyAccountPage;

public class ConnexionOk extends Hooks {
    String Val2 = "automaticiens@yopmail.com";
    String MPD ="Admin*2023";

    @Test
    public void  testconnOk (){

        MyAccountPage accountConec = new MyAccountPage(driver);
       accountConec.CliqueMyaccount();
       accountConec.SaisirmailCo(Val2);
       accountConec.SaisirMDPCo(MPD);
       accountConec.CliquerBoutonLogin();

    }
}



