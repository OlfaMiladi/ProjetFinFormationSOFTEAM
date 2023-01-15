package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        WebElement verfError = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
        String MsgError= verfError.getText();
        System.out.println(MsgError);
        if (MsgError.equals("Error: the password you entered for the username automaticiens@yopmail.com is incorrect.")) {

            System.out.println("Le message Error est affiché correctement");
        } else {
            System.out.println("Le text n'est pas affiché correctement");
        }

    }



}
