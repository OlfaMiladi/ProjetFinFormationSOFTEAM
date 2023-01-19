package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ShopPages {
    WebDriver driver;

    public ShopPages(WebDriver driver) {
        this.driver = driver;
    }

    //cliquer sur la page SHOP

    public void clickShop() {
        WebElement btClickRM = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/shop/']"));
        btClickRM.click();
    }


    //verification des articles OUT OF STOCK //

    public void clickReadMore(String article) {
        WebElement btClickRM = driver.findElement(By.xpath("//*[text()[contains(.,'" + article + "')]]"));
        btClickRM.click();
    }

    public void affOutStock() {
        WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'Out of stock')]"));
        Assert.assertTrue(message.isDisplayed(), "Message non affiché");
    }

    //Verification des articles en stock

    public void clickAddBasket2() {
        WebElement btClickAdd = driver.findElement(By.xpath("//a[@data-product_id='165']"));
        btClickAdd.click();
    }

    public void clickAddBasket1() {
        WebElement btClickAdd1 = driver.findElement(By.xpath("//a[@data-product_id='182']"));
        btClickAdd1.click();
    }


    public void affViewBasket() {
        WebElement message = driver.findElement(By.xpath("//li[contains(@class,'post-182')]/a[@title='View Basket']"));
        Assert.assertTrue(message.isDisplayed(), "Message non affiché");
    }


    public void clickViewBasket() {
        WebElement btClickView = driver.findElement(By.xpath("//li[contains(@class,'post-182')]/a[@title='View Basket']"));
        btClickView.click();
    }

    //Verification des articles existent dans la page shop
    public void verifArticles() {
        WebElement articles = driver.findElement(By.xpath("//ul[contains(@class,'products')]"));
        Assert.assertTrue(articles.isDisplayed(), "Aucun Produit existe");
    }

    //verification des filtres
    public void affFiltrePrice() {
        WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'Filter by price')]"));
        Assert.assertTrue(message.isDisplayed(), "Message non affiché");
    }
    public void affFiltreCategorie() {
        WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'Product Categories')]"));
        Assert.assertTrue(message.isDisplayed(), "Message non affiché");
    }
    public void clickFiltreHTML() {
        WebElement btClickHTML = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/product-category/html/']"));
        //System.out.println(btClickView.getText());
        btClickHTML.click();
    }
    public void veriNbDansFiltreHTML() {
        List<WebElement> listProduct = driver.findElements(By.xpath("//ul[@class='products masonry-done']/li"));
        System.out.println(listProduct.size());
        Assert.assertEquals(listProduct.size(), 3);
    }
    public void clickTitreProduct(String article) {
        WebElement btcClick = driver.findElement(By.xpath("//h3[text()[contains(.,'" + article + "')]]"));
        btcClick.click();
    }
    public void clickPrixProduct(String prix) {
        WebElement btcClick = driver.findElement(By.xpath("//span[text()[contains(.,'" + prix + "')]]"));
        btcClick.click();
    }


    //cartcontents
    public void clickIconeBasket() {

        WebElement btClickIcone = driver.findElement(By.xpath("//span[@class='cartcontents']"));
        btClickIcone.click();

    }

    //affichage du message d'erreur du newsletter
    public void affMessErreur() {
        //WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'Please provide a valid email ')]"));

        WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'Please provide a valid email address.')]"));
        Assert.assertTrue(message.isDisplayed(), "Message non affiché");

    }

    //Verification de l'image du produit existe
    public void verifImageProduit() {
        WebElement verif = driver.findElement(By.xpath("//img[@title='Android Quick Start Guide']"));
        Assert.assertTrue(verif.isDisplayed(), "Image non visible");
    }
    //Verification du titre du produit existe
    public void verifTitreProduit(String article) {
        WebElement verif = driver.findElement(By.xpath("//*[contains(.,'" +article+ "')]"));
        Assert.assertTrue(verif.isDisplayed(), "Titre non visible");
    }


    //Verification du prix du produit existe
    public void verifPrixProduit() {
        WebElement prix = driver.findElement(By.xpath("//span[@class='price']"));
        Assert.assertTrue(prix.isDisplayed(), "Prix non visible");
    }




   //Verification newsletter

    public void verifTitreSouscribe() {
        WebElement titreSub = driver.findElement(By.xpath("//h4[@class='widgettitle'][contains(text(), 'Subscribe Here')]"));
        Assert.assertTrue(titreSub.isDisplayed(), "Titre non visible");
    }
    public void verifChampSouscribe() {
        WebElement champ = driver.findElement(By.xpath("//input[@type='email']"));
        Assert.assertTrue(champ.isDisplayed(), "Champ non visible");
    }

    public void verifBoutonSouscribe() {
        WebElement bouton = driver.findElement(By.xpath("//input[@type='submit']"));
        Assert.assertTrue(bouton.isDisplayed(), "Bouton non visible");
    }
    public void saisirSubscribe(String mail) {
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys(mail);
    }

    public void clickSubscribe() {

        WebElement btCSub = driver.findElement(By.xpath("//input[@type='submit']"));
        btCSub.click();

    }


}

