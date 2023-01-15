package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Shop {
    WebDriver driver;

    public Shop(WebDriver driver) {
        this.driver = driver;
    }


    //cliquer sur la page SHOP

    public void clickshop() {
        WebElement btclickrm = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/shop/']"));
        btclickrm.click();
    }


    //verification des articles OUT OF STOCK //

    public void clickreadmore() {
        WebElement btclickrm = driver.findElement(By.xpath("//a[@data-product_id='163']"));
        btclickrm.click();
    }

    public void affoutstock() {
        WebElement message1 = driver.findElement(By.xpath("//*[contains(text(), 'Out of stock')]"));
        Assert.assertTrue(message1.isDisplayed(), "Message non affiché");
    }

    //Verification des articles en stock (verif du titre view basket!!!)

    public void clickaddbasket() {
        WebElement btclickadd = driver.findElement(By.xpath("//a[@data-product_id='182']"));
        btclickadd.click();
    }

        public void affviewbasket() {
            WebElement message4 = driver.findElement(By.xpath("//*[contains(text(), 'View Basket')]"));
            Assert.assertTrue(message4.isDisplayed(), "Message non affiché");
        }


    public void clickviewbasket() {
        WebElement btclickview = driver.findElement(By.xpath("//a[@title='View Basket']"));
        btclickview.click();
    }

    //verification des filtres

    public void afffiltreprice() {
        WebElement message2 = driver.findElement(By.xpath("//*[contains(text(), 'Filter by price')]"));
        Assert.assertTrue(message2.isDisplayed(), "Message non affiché");
    }

    public void afffiltrecategorie() {
        WebElement message3 = driver.findElement(By.xpath("//*[contains(text(), 'Product Categories')]"));
        Assert.assertTrue(message3.isDisplayed(), "Message non affiché");
    }



}

