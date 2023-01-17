package Tests;


import commun.Hooks;
import Pages.MyAccountDetailPage;
import Pages.MyAccountPage;
import org.testng.annotations.Test;

public class T17AccountDétail extends Hooks {
    String Val2 = "Softeam17@yopmail.com";
    String MPD ="Softeam@1";

    @Test
    public void MonAcountDétail(){
        MyAccountPage accountConec = new MyAccountPage(driver);
        MyAccountDetailPage mesinformation = new MyAccountDetailPage(driver);
        accountConec.CliqueMyaccount();
        accountConec.SaisirmailCo(Val2);
        accountConec.SaisirMDPCo(MPD);
        accountConec.CliquerBoutonLogin();
        accountConec.AccountDetailsPage();
        mesinformation.verifiePresenceNom();
        mesinformation.VerifierChampsNom();
        mesinformation.verifiePresencePrénom();
        mesinformation.VerifierChampsPrénom();
        mesinformation.verifiePresenceMail();
        mesinformation.VerifierChampsMail();
    }


}
