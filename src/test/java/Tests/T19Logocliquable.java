package Tests;

import Pages.MyAccountDetailPage;
import Pages.MyAccountPage;
import com.beust.ah.A;
import commun.Hooks;
import org.testng.annotations.Test;
import pages.AccueilPage;

public class T19Logocliquable extends Hooks {


    @Test
    public void  Logocliquable (){

        AccueilPage Accueil = new AccueilPage(driver);
        Accueil.VerifLogo();
        Pages.MyAccountPage Account = new MyAccountPage(driver);
        Account.CliqueMyaccount();
        Accueil.VerifLogo();



    }
}
