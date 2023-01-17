package Tests;

import Pages.MyAccountPage;
import commun.Hooks;
import org.testng.annotations.Test;

public class T17AccountDétail extends Hooks {
    String Val2 = "Softeam17@yopmail.com";
    String MPD ="Softeam@1";

    @Test
    public void MonAcountDétail(){
        MyAccountPage accountConec = new MyAccountPage(driver);
        accountConec.CliqueMyaccount();
        accountConec.SaisirmailCo(Val2);
        accountConec.SaisirMDPCo(MPD);
        accountConec.CliquerBoutonLogin();



    }


}
