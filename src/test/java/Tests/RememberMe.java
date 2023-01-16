package Tests;

import org.testng.annotations.Test;

public class RememberMe extends ConnexionOk {

    @Test
    public void  FonctionRememberme (){

        Pages.MyAccountPage RememberMe = new Pages.MyAccountPage(driver);
        RememberMe.FonctionRememberMe();

    }


}
