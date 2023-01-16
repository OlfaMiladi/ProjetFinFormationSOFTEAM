package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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

    public void clickReadMore() {
        WebElement btClickRM = driver.findElement(By.xpath("//a[@data-product_id='163']"));
        btClickRM.click();
    }

    public void affOutStock() {
        WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'Out of stock')]"));
        Assert.assertTrue(message.isDisplayed(), "Message non affiché");
    }

    //Verification des articles en stock (verif du titre view basket!!!)

    public void clickAddBasket2() {
        WebElement btClickAdd = driver.findElement(By.xpath("//a[@data-product_id='165']"));
        btClickAdd.click();
    }

    public void clickAddBasket1() {
        WebElement btClickAdd1 = driver.findElement(By.xpath("//a[@data-product_id='182']"));
        btClickAdd1.click();
    }


        public void affViewBasket() {
            WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'View Basket')]"));
            Assert.assertTrue(message.isDisplayed(), "Message non affiché");
        }


    public void clickViewBasket() {
        WebElement btClickView = driver.findElement(By.xpath("//li[contains(@class,'post-182')]/a[@title='View Basket']"));
        btClickView.click();
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

    //cartcontents
    public void clickIconeBasket(){

        WebElement btClickIcone = driver.findElement(By.xpath("//span[@class='cartcontents']"));
        btClickIcone.click();

    }

   /* public void affPanier(){
        WebElement mess = driver.findElement(By.xpath("//*[contains(text(), 'Basket Totals')]"));
        Assert.assertTrue(mess.isDisplayed(), "Message non affiché");

    }*/

    // souscribe a la newsletter

    public void saisirSubscribe(String mail){
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys(mail);
    }

    public void clickSubscribe(){

        WebElement btCSub = driver.findElement(By.xpath("//input[@type='submit']"));
        btCSub.click();

    }
    //affichage du message d'erreur du newsletter
    public void affMessErreur(){
        //WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'Please provide a valid email ')]"));

        WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'Please provide a valid email address.')]"));
        Assert.assertTrue(message.isDisplayed(), "Message non affiché");

    }

   public void clickProduct(){
       WebElement btcClick = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/product/html5-webapp-develpment/']"));
       btcClick.click();

   }
   public void clickImageProduit(){
       WebElement btcClick = driver.findElement(By.xpath("//img[@title='Android Quick Start Guide']"));
       btcClick.click();

   }
   public void clickTitreProduit(){
       WebElement btcClick = driver.findElement(By.xpath("//img[@title='Android Quick Start Guide']"));
       btcClick.click();
   }



}

