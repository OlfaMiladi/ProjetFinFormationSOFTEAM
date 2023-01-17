package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

// CONSTRUCTOR
public class MyAccountPage {
    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    // Cliquer sur my account

    public void CliqueMyaccount() {

        WebElement linkMyaccount = driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a"));
        linkMyaccount.click();

    }

    //Creation de compte reussite
    public void Saisirmail(String Val1) {
        WebElement AdresseMAil = driver.findElement(By.id("reg_email"));
        AdresseMAil.sendKeys(Val1);
    }

    public void SaisirMDP(String MDP) {
        WebElement passeword = driver.findElement(By.id("reg_password"));
        passeword.sendKeys(MDP);
    }

    public void CliquerBoutonResgister() {
        WebElement Register = driver.findElement(By.name("register"));
        Register.click();
    }

    //Connexion au compte

    public void SaisirmailCo(String val2) {
        WebElement AdresseMAil = driver.findElement(By.id("username"));
        AdresseMAil.sendKeys(val2);
    }

    public void SaisirMDPCo(String MDPCo) {
        WebElement passewordCo = driver.findElement(By.id("password"));
        passewordCo.sendKeys(MDPCo);
    }

    public void CliquerBoutonLogin() {
        WebElement Login = driver.findElement(By.name("login"));
        Login.click();
    }

    //Vérification de message Error connexion

    public void VerifMsgError(){
        WebElement verfError = driver.findElement(By.className("woocommerce-error"));
        String MsgError= verfError.getText();
        //System.out.println(MsgError);
        Assert.assertTrue(MsgError.contains("Error: the password you entered for the username "), "Le message n'est pas affiché" );

        /*
        if (MsgError.equals("Error: the password you entered for the username automaticiens@yopmail.com is incorrect. Lost your password?")) {

            System.out.println("Le message Error est affiché correctement");
        } else {
            System.out.println("Le text n'est pas affiché correctement");
        }

         */

    }

    //Le bon fonctionnement de la case à cocher REMEMBER ME

    public void FonctionRememberMe (){
        WebElement RememberMe = driver.findElement(By.xpath("//*[@id=\"rememberme\"]"));
        RememberMe.click();
        }

    public void Verifmailrempli(){
        WebElement MailRempli = driver.findElement(By.id("username"));

        String expectedTitle = "automaticiens@yopmail.com";
        String originalTitle = MailRempli.getText();
        Assert.assertEquals(originalTitle, expectedTitle, "E-mail non affiché");
        //System.out.println(originalTitle);
        //originalTitle.contains(expectedTitle);
        //Assert.assertTrue(MailRempli.isDisplayed(), "E-mail non affiché");

    }

    //Déconnexion du compte

    public void Sedeconnecter(){
        WebElement Deconnexion = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a"));
        Deconnexion.click();

    }

    //Vérification des deux pavé Login et register sur MyacountPage

    public void VerifPaveLogin (){
        WebElement PaveLogin = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]"));
        String Login= PaveLogin.getText();
        Assert.assertTrue(Login.contains("Login"), "Le Pavé Register n'est pas disponible" );

    }

    public void VerifPaveRegister(){
        WebElement PaveRegister = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]"));
        String Register= PaveRegister.getText();
        Assert.assertTrue(Register.contains("Register"), "Le Pavé Login n'est pas disponible" );
    }
/*
    //Reinitialisation de mot de passe
    public void ReinitialiserMDP (){
        WebElement ReinitiaMDP= driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/a"));
        ReinitiaMDP.click();

    }
    public void SaisirmailReinit(String Val2){
        WebElement ReinitMAil = driver.findElement(By.id("user_login"));
        ReinitMAil.sendKeys(Val2);
    }
    public void ResetPasseword(){
        WebElement ResetMDP = driver.findElement(By.className("woocommerce-Button button"));
       ResetMDP.click();
    }*/


    //Vérification de la présence des pages : Dashboard, Orders, Download, Adresses, Account Details, Logout

    public void AccountDetailsPage(){
        WebElement AccountDetails= driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[5]/a"));
        AccountDetails.click();
       /*String AccDetails= AccountDetails.getText();
        Assert.assertTrue(AccDetails.contains("Account Details"), "La page Account Details n'existe pas" );*/
           }




/*
    //Souscription à la newsletter
    public void verifChampSouscribe(){
        WebElement champ = driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/p[1]/input"));
        Assert.assertTrue(champ.isDisplayed(), "Champ non visible");
    }
    public void verifBoutonSouscribe(){
        WebElement bouton = driver.findElement(By.xpath("//input[@type='submit']"));
        Assert.assertTrue(bouton.isDisplayed(), "Bouton non visible");
    }
*/

}
