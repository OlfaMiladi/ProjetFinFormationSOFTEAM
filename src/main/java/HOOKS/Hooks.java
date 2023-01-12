package HOOKS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {
    public ChromeDriver driver;

    @BeforeMethod
    public void beforetest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");

        driver.manage().window().maximize();

    }

    @AfterMethod
    public void afterclass() {
        //driver.close();
    }

}
