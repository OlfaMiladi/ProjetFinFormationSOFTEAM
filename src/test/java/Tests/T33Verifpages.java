package Tests;

import commun.Hooks;
import org.testng.annotations.Test;

public class T33Verifpages extends Hooks {

    String Val2 = "automaticiens@yopmail.com";
    String MPD ="Admin*2023";

    @Test
    public void  VerificationPages (){

        Pages.MyAccountPage accountConec = new Pages.MyAccountPage(driver);
        accountConec.CliqueMyaccount();
        accountConec.SaisirmailCo(Val2);
        accountConec.SaisirMDPCo(MPD);
        accountConec.CliquerBoutonLogin();
        accountConec.VerifDashboardPage();
        accountConec.VerifOrdersPage();
        accountConec.VerifDownloadsPage();
        accountConec.VerifAddressesPage();
        accountConec.VerifAccountDetailsPage();
        accountConec.VerifLogoutPage();
    }
}
