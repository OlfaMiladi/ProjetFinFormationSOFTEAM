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

    public void VerifMsgError() {
        WebElement verfError = driver.findElement(By.className("woocommerce-error"));
        String MsgError = verfError.getText();

        Assert.assertTrue(MsgError.contains("Error: the password you entered for the username "), "Le message n'est pas affiché");
    }


    //Déconnexion du compte

    public void Sedeconnecter() {
        WebElement Deconnexion = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a"));
        Deconnexion.click();

    }

    //Vérification des deux pavé Login et register sur MyacountPage

    public void VerifPaveLogin() {
        WebElement PaveLogin = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]"));
        String Login = PaveLogin.getText();
        Assert.assertTrue(Login.contains("Login"), "Le Pavé Register n'est pas disponible");

    }

    public void VerifPaveRegister() {
        WebElement PaveRegister = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]"));
        String Register = PaveRegister.getText();
        Assert.assertTrue(Register.contains("Register"), "Le Pavé Login n'est pas disponible");
    }


    //Reinitialisation de mot de passe
    public void ReinitialiserMDP() {
        WebElement ReinitiaMDP = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/a"));
        ReinitiaMDP.click();

    }

    public void SaisirmailReinit(String Val2) {
        WebElement ReinitMAil = driver.findElement(By.id("user_login"));
        ReinitMAil.sendKeys(Val2);
    }

    public void ResetPasseword() {
        WebElement ResetMDP = driver.findElement(By.className("woocommerce-Button button"));
        ResetMDP.click();
    }


    //Vérification de la présence des pages : Dashboard, Orders, Download, Adresses, Account Details, Logout


    public void VerifDashboardPage() {
        WebElement Dashboard = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[1]/a"));
        String DBoard = Dashboard.getText();
        Assert.assertTrue(DBoard.contains("Dashboard"), "La page Dashboard n'existe pas");
    }



    public void DashboardPage() {
        WebElement Dashboard = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[1]/a"));
        Dashboard.click();
    }

    public void VerifOrdersPage() {
        WebElement POrders = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a"));
        String Orders = POrders.getText();
        Assert.assertTrue(Orders.contains("Orders"), "La page Orders n'existe pas");
    }

    public void OrdersPage() {
        WebElement Orders = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a"));
        Orders.click();
    }

    public void VerifDownloadsPage() {
        WebElement Downloads = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[3]/a"));
        String Dwld = Downloads.getText();
        Assert.assertTrue(Dwld.contains("Downloads"), "La page Downloads n'existe pas");
    }

    public void DownloadsPage() {
        WebElement Downloads = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[3]/a"));
        Downloads.click();
    }

    public void VerifAddressesPage() {
        WebElement Addresses = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[4]/a"));
        String Adsse = Addresses.getText();
        Assert.assertTrue(Adsse.contains("Addresses"), "La page Addresses n'existe pas");
    }

    public void AddressesPage() {
        WebElement Adresses = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[4]/a"));
        Adresses.click();
    }

    public void VerifAccountDetailsPage() {
        WebElement AccountDetails = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[5]/a"));
        String AccDetails = AccountDetails.getText();
        Assert.assertTrue(AccDetails.contains("Account Details"), "La page Account Details n'existe pas");
    }


    public void AccountDetailsPage() {
        WebElement AccountDetails = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[5]/a"));
        AccountDetails.click();
    }

    public void VerifLogoutPage() {
        WebElement Logout = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a"));
        String LOut = Logout.getText();
        Assert.assertTrue(LOut.contains("Logout"), "La page Logout n'existe pas");
    }

    public void LogoutPage() {
        WebElement Logout = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a"));
        Logout.click();
    }

    public void VerifIconePanier(){

        WebElement IconePanier = driver.findElement(By.className("wpmenucart-icon-shopping-cart-0"));
        IconePanier.isEnabled();
    }


}

