package Tests;

import Pages.MyAccountDetailPage;
import Pages.MyAccountPage;
import commun.Hooks;
import org.testng.annotations.Test;

public class T82ChangmenetMpAccount extends Hooks {
    String Val2 = "Softeam17@yopmail.com";
    String MPD ="Softeam@4";
    @Test
    public void ChangementMotDePasse2(){
    MyAccountPage accountConec = new MyAccountPage(driver);
    MyAccountDetailPage mesinformation = new MyAccountDetailPage(driver);

        accountConec.CliqueMyaccount();
        accountConec.SaisirmailCo(Val2);
        accountConec.SaisirMDPCo(MPD);
        accountConec.CliquerBoutonLogin();
        accountConec.AccountDetailsPage();
        mesinformation.SaisirMdpActuel("Softeam@3");
        mesinformation.SaisirNouveauMdp("Softeam@4");
        mesinformation.ConfirmerNouveauMdp("Softeam@5");
        mesinformation.EnregitrerModificationMps();
        mesinformation.Verifiermessage2();

}
}
